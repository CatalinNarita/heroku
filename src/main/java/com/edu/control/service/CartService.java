package com.edu.control.service;

import com.edu.control.dao.*;
import com.edu.control.dto.CartDTO;
import com.edu.control.dto.ItemDTO;
import com.edu.control.dto.ProductDTO;
import com.edu.control.dto.mapper.CartDTOMapper;
import com.edu.control.dto.mapper.ItemDTOMapper;
import com.edu.control.dto.mapper.ItemHistoryDTOMapper;
import com.edu.control.dto.mapper.ProductDTOMapper;
import com.edu.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CartService {

    @Autowired
    private CartDAO cartDAO;

    @Autowired
    private ItemDAO itemDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private ItemHistoryDAO itemHistoryDAO;

    private CartDTOMapper mapper = CartDTOMapper.INSTANCE;

    private ItemDTOMapper itemDTOMapper = ItemDTOMapper.INSTANCE;

    private ProductDTOMapper productDTOMapper = ProductDTOMapper.INSTANCE;

    private ItemHistoryDTOMapper itemHistoryDTOMapper = ItemHistoryDTOMapper.INSTANCE;

    public CartDTO getCartById(Long id) {
        return mapper.mapToDto(cartDAO.findOne(id));
    }

    public boolean updateCart(Long id, ProductDTO productDTO) {
        Item item = itemDAO.getItemByProductIdAndCartId(productDTO.getId(), id);

        if (item != null && item.getCart().getId() == id) {
            item.setQuantity(item.getQuantity() + 1);
            return true;
        } else {
            Item newItem = new Item();
            Product product = new Product();
            product.setId(productDTO.getId());
            product.setPrice(productDTO.getPrice());
            product.setName(productDTO.getName());
            product.setCategory(productDTO.getCategory());
            product.setProductSpec(productDTO.getProductSpec());

            newItem.setProduct(product);
            newItem.setQuantity(1);
            newItem.setCart(cartDAO.findOne(id));
            itemDAO.save(newItem);

            Cart cart = cartDAO.findOne(id);
            cart.getItems().add(newItem);
            return false;
        }
    }

    public void checkout(CartDTO cartDTO) {

        ItemHistory itemHistory = new ItemHistory();
        itemHistory.setDate(new Timestamp(System.currentTimeMillis()));

        List<Product> products = new ArrayList<>();

        Double totalPrice = 0.0;

        for(int i = 0; i < cartDTO.getItems().size(); i++) {
            products.add(cartDTO.getItems().get(i).getProduct());
            totalPrice += cartDTO.getItems().get(i).getQuantity() * cartDTO.getItems().get(i).getProduct().getPrice();
        }

        itemHistory.setProducts(products);
        itemHistory.setUserId(cartDTO.getId());

        itemHistory.setTotalPrice(totalPrice);

        itemHistoryDAO.save(itemHistory);

        cartDTO.getItems().forEach(item -> itemDAO.deleteItemByProductId(item.getProduct().getId()));
    }

}
