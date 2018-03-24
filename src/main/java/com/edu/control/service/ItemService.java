package com.edu.control.service;

import com.edu.control.dao.ItemDAO;
import com.edu.control.dto.ItemDTO;
import com.edu.control.dto.ProductDTO;
import com.edu.control.dto.mapper.ItemDTOMapper;
import com.edu.control.dto.mapper.ProductDTOMapper;
import com.edu.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ItemService {

    @Autowired
    private ItemDAO itemDAO;

    private ItemDTOMapper mapper = ItemDTOMapper.INSTANCE;

    private ProductDTOMapper productDTOMapper = ProductDTOMapper.INSTANCE;

    public ItemDTO getItemById(Long id) {
        return mapper.mapToDto(itemDAO.findOne(id));
    }

    public List<ItemDTO> getAllItems() {
        return itemDAO.findAll()
                .stream()
                .map(item -> mapper.mapToDto(item))
                .collect(Collectors.toList());
    }

    public void addItem(ItemDTO itemDTO) {
        if(itemDTO.getId() != null) {
            Item item = itemDAO.findOne(itemDTO.getId());
            if (item == null) {
                itemDAO.save(mapper.mapToEntity(itemDTO));
            } else {
                item.setQuantity(item.getQuantity() + 1);
            }
        } else {
            itemDAO.save(mapper.mapToEntity(itemDTO));
        }

    }

    public void updateItem(ItemDTO itemDTO) {
        Item item = itemDAO.findOne(itemDTO.getId());

        item.setProduct(itemDTO.getProduct());
        item.setQuantity(itemDTO.getQuantity());
    }

    public void deleteItem(Long id) {
        itemDAO.deleteItemByProductId(id);
    }


}
