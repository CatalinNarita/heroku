package com.edu.control.dto;

import com.edu.entity.Item;
import com.edu.entity.Product;
import com.edu.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CartDTO {

    private Long id;

    private List<Item> items;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;

    public CartDTO(){}

    public CartDTO(Long id, List<Item> items, User user) {
        this.id = id;
        this.items = items;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
