package com.edu.control.service;

import com.edu.control.dao.OrderDAO;
import com.edu.control.dao.UserDAO;
import com.edu.control.dto.OrderDTO;
import com.edu.control.dto.mapper.ItemDTOMapper;
import com.edu.control.dto.mapper.OrderDTOMapper;
import com.edu.entity.Item;
import com.edu.entity.Order;
import com.edu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private UserDAO userDAO;

    private OrderDTOMapper mapper = OrderDTOMapper.INSTANCE;

    public OrderDTO getOrderById(Long id) {
        Order order = orderDAO.findOne(id);
        return mapper.mapToDto(orderDAO.findOne(id));
    }

    public List<OrderDTO> getAllOrders() {
        return orderDAO.findAll()
                .stream()
                .map(order -> mapper.mapToDto(order))
                .collect(Collectors.toList());
    }

    public void addOrder(Long userId, OrderDTO orderDTO) {
       /* User user = userDAO.findOne(userId);
        OrderDTO newOrder = orderDTO;
        newOrder.setUser(user);
        newOrder.setItems(null);
        orderDAO.save(mapper.mapToEntity(newOrder));*/
    }

    public void updateOrder(OrderDTO orderDTO) {
        Order order = orderDAO.findOne(orderDTO.getId());
        order.setAddress(orderDTO.getAddress());
    }

    public void deleteOrder(Long id) {
        Order order = orderDAO.findOne(id);

        //order.setProducts(null);
        orderDAO.delete(order);
    }

}
