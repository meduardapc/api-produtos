package com.example.demo.dto;

import com.example.demo.entities.Product;

public class ProductDTO {

    private Long id;
    private String name;

    public ProductDTO(){

    }

    public ProductDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
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
}
