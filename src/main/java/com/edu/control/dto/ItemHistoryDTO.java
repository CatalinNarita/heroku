package com.edu.control.dto;

import com.edu.entity.Product;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by catal on 1/14/2018
 */
public class ItemHistoryDTO {
    private Long id;

    private Long userId;

    private List<Product> products;

    private Timestamp date;

    private Double totalPrice;

    public ItemHistoryDTO(){}

    public ItemHistoryDTO(Long id, Long userId, List<Product> products, Timestamp date, Double totalPrice) {
        this.id = id;
        this.userId = userId;
        this.products = products;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
