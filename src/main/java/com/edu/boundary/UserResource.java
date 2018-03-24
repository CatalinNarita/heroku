package com.edu.boundary;

import com.edu.control.dto.ItemHistoryDTO;
import com.edu.control.dto.OrderDTO;
import com.edu.control.dto.UserDTO;
import com.edu.control.service.OrderService;
import com.edu.control.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserDTO getUserById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/get/{username}", method = RequestMethod.GET)
    public UserDTO getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public void updateUser(@RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

    @RequestMapping(value = "/{id}/orders", method = RequestMethod.GET)
    public List<ItemHistoryDTO> getOrdersByUserId(@PathVariable("id") Long id) {
        return userService.getUserOrders(id);
    }

    @RequestMapping(value = "/getByEmail/{email:.+}", method = RequestMethod.GET)
    public UserDTO getUserByEmail(@PathVariable("email") String email) {
        return userService.getUserByEmail(email);
    }

    @RequestMapping(value = "/getByNfcTag/{nfcTag}", method = RequestMethod.GET)
    public UserDTO getUserByNfcTag(@PathVariable("nfcTag") String tagId) {
        return userService.getUserByNfcTag(tagId);
    }


}
