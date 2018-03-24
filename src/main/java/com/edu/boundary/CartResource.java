package com.edu.boundary;

import com.edu.control.dto.CartDTO;
import com.edu.control.dto.ItemDTO;
import com.edu.control.dto.ProductDTO;
import com.edu.control.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartResource {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CartDTO getCartById(@PathVariable("id") Long id) {
        return cartService.getCartById(id);
    }

    @RequestMapping(value = "/{id}/addItem", method = RequestMethod.PUT)
    public boolean updateCart(@RequestBody ProductDTO productDTO, @PathVariable("id") Long id) {
        return cartService.updateCart(id, productDTO);
    }

    @RequestMapping(value = "/checkout", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void checkout(@RequestBody CartDTO cartDTO) {
        this.cartService.checkout(cartDTO);
    }
}
