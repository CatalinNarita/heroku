package com.edu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "smartphone_spec")
public class SmartphoneSpec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String producer;

    @Enumerated(EnumType.STRING)
    private GuaranteePeriodEnum guarantee;

    @Enumerated(EnumType.STRING)
    private ColourEnum colour;

    @Column
    private String screen;

    @Column
    private String processor;

    @Column
    private String resolution;

    @Column
    private int memory;

    @OneToOne(cascade = CascadeType.ALL)
    private ProductSpec productSpec;

    public SmartphoneSpec() {
    }

    public SmartphoneSpec(String producer, GuaranteePeriodEnum guarantee, ColourEnum colour, String screen, String processor, String resolution, int memory, ProductSpec productSpec) {
        this.producer = producer;
        this.guarantee = guarantee;
        this.colour = colour;
        this.screen = screen;
        this.processor = processor;
        this.resolution = resolution;
        this.memory = memory;
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

    public ColourEnum getColour() {
        return colour;
    }

    public void setColour(ColourEnum colour) {
        this.colour = colour;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
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

        SmartphoneSpec that = (SmartphoneSpec) o;

        if (memory != that.memory) return false;
        if (!producer.equals(that.producer)) return false;
        if (guarantee != that.guarantee) return false;
        if (colour != that.colour) return false;
        if (!screen.equals(that.screen)) return false;
        if (!processor.equals(that.processor)) return false;
        if (!resolution.equals(that.resolution)) return false;
        return productSpec.equals(that.productSpec);
    }

    @Override
    public int hashCode() {
        int result = producer.hashCode();
        result = 31 * result + guarantee.hashCode();
        result = 31 * result + colour.hashCode();
        result = 31 * result + screen.hashCode();
        result = 31 * result + processor.hashCode();
        result = 31 * result + resolution.hashCode();
        result = 31 * result + memory;
        result = 31 * result + productSpec.hashCode();
        return result;
    }
}
