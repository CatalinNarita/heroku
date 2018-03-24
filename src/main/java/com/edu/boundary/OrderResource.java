package com.edu.boundary;

import com.edu.control.dto.OrderDTO;
import com.edu.control.dto.UserDTO;
import com.edu.control.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrderDTO getOrderById(@PathVariable("id") Long id) {
        return orderService.getOrderById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @RequestMapping(value = "/{userId}/addOrder", method = RequestMethod.POST)
    public void addOrder(@RequestBody OrderDTO orderDTO, @PathVariable("userId") Long userId) {
        orderService.addOrder(userId, orderDTO);
    }

    @RequestMapping(value = "/updateOrder", method = RequestMethod.PUT)
    public void updateOrder(@RequestBody OrderDTO orderDTO) {
        orderService.updateOrder(orderDTO);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteOrder(@PathVariable("id") Long id) {
        orderService.deleteOrder(id);
    }

}
