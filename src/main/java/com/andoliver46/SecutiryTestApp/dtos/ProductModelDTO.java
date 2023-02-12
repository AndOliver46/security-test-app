package com.andoliver46.SecutiryTestApp.dtos;

import com.andoliver46.SecutiryTestApp.model.ProductModel;
import jakarta.persistence.Column;

import java.io.Serializable;

public class ProductModelDTO implements Serializable {

    private String name;
    private String description;
    private Double price;

    public ProductModelDTO(ProductModel model){
        this.name = model.getName();
        this.description = model.getDescription();
        this.price = model.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
