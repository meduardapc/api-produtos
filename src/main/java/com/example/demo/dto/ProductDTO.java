package com.example.demo.dto;

import com.example.demo.entities.Product;
import com.example.demo.enums.ProductCategoryEnum;
import jakarta.validation.constraints.Null;

import java.time.LocalDateTime;

public class ProductDTO {

    private Long id;
    private String name;
    private ProductCategoryEnum category;
    private int qtdEstoque;
    @Null
    private LocalDateTime dataCadastro;

    public ProductDTO(){

    }

    public ProductDTO(Long id, String name, ProductCategoryEnum category, int qtdEstoque, LocalDateTime dataCadastro) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.qtdEstoque = qtdEstoque;
        this.dataCadastro = dataCadastro;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        category = product.getCategory();
        qtdEstoque = product.getQtdEstoque();
        dataCadastro = product.getDataCadastro();
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

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
