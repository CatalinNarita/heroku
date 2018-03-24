package com.edu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Item.deleteItemByProductId", query = "DELETE FROM Item i WHERE i.product.id = ?"),
        @NamedQuery(name = "Item.getItemByProductIdAndCartId", query = "SELECT i FROM Item i where i.product.id = ? AND i.cart.id = ?")
})
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column
    private Integer quantity;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "items", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Order> orders;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    @JsonBackReference
    private Cart cart;

    public Item(){}

    public Item(Product product, Integer quantity, List<Order> orders, Cart cart) {
        this.product = product;
        this.quantity = quantity;
        this.orders = orders;
        this.cart = cart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
