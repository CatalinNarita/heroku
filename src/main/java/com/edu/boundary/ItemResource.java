package com.edu.boundary;

import com.edu.control.dto.ItemDTO;
import com.edu.control.dto.ProductDTO;
import com.edu.control.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemResource {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ItemDTO getItemById(@PathVariable("id") Long id) {
        return itemService.getItemById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ItemDTO> getAllItems() {
        return itemService.getAllItems();
    }

    @RequestMapping(value = "/addItem", method = RequestMethod.POST)
    public void addItem(@RequestBody ItemDTO itemDTO) {
        itemService.addItem(itemDTO);
    }

    @RequestMapping(value = "/updateItem", method = RequestMethod.PUT)
    public void updateItem(@RequestBody ItemDTO itemDTO) {
        itemService.updateItem(itemDTO);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }

}
