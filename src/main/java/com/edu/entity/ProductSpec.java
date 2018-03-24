package com.edu.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "product_spec")
public class ProductSpec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "monitor_spec_id")
    private MonitorSpec monitorSpec;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_spec_id")
    private LaptopSpec laptopSpec;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "smartphone_spec_id")
    private SmartphoneSpec smartphoneSpec;

    @OneToOne(cascade = CascadeType.ALL)
    private Product product;

    public ProductSpec() {
    }

    public ProductSpec(MonitorSpec monitorSpec, LaptopSpec laptopSpec, SmartphoneSpec smartphoneSpec, Product product) {
        this.monitorSpec = monitorSpec;
        this.laptopSpec = laptopSpec;
        this.smartphoneSpec = smartphoneSpec;
        this.product = product;
    }

    public ProductSpec(MonitorSpec monitorSpec, LaptopSpec laptopSpec, SmartphoneSpec smartphoneSpec) {
        this.monitorSpec = monitorSpec;
        this.laptopSpec = laptopSpec;
        this.smartphoneSpec = smartphoneSpec;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MonitorSpec getMonitorSpec() {
        return monitorSpec;
    }

    public void setMonitorSpec(MonitorSpec monitorSpec) {
        this.monitorSpec = monitorSpec;
    }

    public LaptopSpec getLaptopSpec() {
        return laptopSpec;
    }

    public void setLaptopSpec(LaptopSpec laptopSpec) {
        this.laptopSpec = laptopSpec;
    }

    public SmartphoneSpec getSmartphoneSpec() {
        return smartphoneSpec;
    }

    public void setSmartphoneSpec(SmartphoneSpec smartphoneSpec) {
        this.smartphoneSpec = smartphoneSpec;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductSpec that = (ProductSpec) o;

        if (!monitorSpec.equals(that.monitorSpec)) return false;
        if (!laptopSpec.equals(that.laptopSpec)) return false;
        if (!smartphoneSpec.equals(that.smartphoneSpec)) return false;
        return product.equals(that.product);
    }

    @Override
    public int hashCode() {
        int result = monitorSpec.hashCode();
        result = 31 * result + laptopSpec.hashCode();
        result = 31 * result + smartphoneSpec.hashCode();
        result = 31 * result + product.hashCode();
        return result;
    }
}
