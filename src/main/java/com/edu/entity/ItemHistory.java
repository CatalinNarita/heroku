package com.edu.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by catal on 1/14/2018
 */
@Entity
@NamedQuery(name = "ItemHistory.getItemHistoryByUserId", query = "SELECT ih FROM ItemHistory ih where ih.userId = ?")
public class ItemHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;

    @Column
    @ElementCollection(targetClass=Product.class)
    private List<Product> products;

    @Column
    private Timestamp date;

    @Column
    private Double totalPrice;

    public ItemHistory(){}

    public ItemHistory(Long userId, List<Product> products, Timestamp date, Double totalPrice) {
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
