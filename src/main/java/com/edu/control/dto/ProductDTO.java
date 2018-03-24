package com.edu.control.dto;

import com.edu.entity.ProductCategoryEnum;
import com.edu.entity.ProductSpec;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDTO {

    private Long id;

    private String name;

    private ProductCategoryEnum category;

    private Double price;

    private ProductSpec productSpec;

    private int quantity;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, ProductCategoryEnum category, Double price, int quantity, ProductSpec productSpec) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.productSpec = productSpec;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(ProductCategoryEnum category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductSpec getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(ProductSpec productSpec) {
        this.productSpec = productSpec;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
