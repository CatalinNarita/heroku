package com.edu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "monitor_spec")
public class MonitorSpec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String producer;

    @Enumerated(EnumType.STRING)
    private GuaranteePeriodEnum guarantee;

    @Column
    private Double diagonal;

    @Column
    private String resolution;

    @Enumerated(EnumType.STRING)
    private ColourEnum colour;

    @Column(name = "aspect_ratio")
    private String aspectRatio;

    @OneToOne(cascade = CascadeType.ALL)
    private ProductSpec productSpec;

    public MonitorSpec() {
    }

    public MonitorSpec(String producer, GuaranteePeriodEnum guarantee, Double diagonal, String resolution, ColourEnum colour, String aspectRatio, ProductSpec productSpec) {
        this.producer = producer;
        this.guarantee = guarantee;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.colour = colour;
        this.aspectRatio = aspectRatio;
        this.productSpec = productSpec;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public GuaranteePeriodEnum getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(GuaranteePeriodEnum guarantee) {
        this.guarantee = guarantee;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public ColourEnum getColour() {
        return colour;
    }

    public void setColour(ColourEnum colour) {
        this.colour = colour;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public ProductSpec getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(ProductSpec productSpec) {
        this.productSpec = productSpec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonitorSpec that = (MonitorSpec) o;

        if (!producer.equals(that.producer)) return false;
        if (guarantee != that.guarantee) return false;
        if (!diagonal.equals(that.diagonal)) return false;
        if (!resolution.equals(that.resolution)) return false;
        if (colour != that.colour) return false;
        if (!aspectRatio.equals(that.aspectRatio)) return false;
        return productSpec.equals(that.productSpec);
    }

    @Override
    public int hashCode() {
        int result = producer.hashCode();
        result = 31 * result + guarantee.hashCode();
        result = 31 * result + diagonal.hashCode();
        result = 31 * result + resolution.hashCode();
        result = 31 * result + colour.hashCode();
        result = 31 * result + aspectRatio.hashCode();
        result = 31 * result + productSpec.hashCode();
        return result;
    }
}
