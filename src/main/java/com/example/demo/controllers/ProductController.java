package com.example.demo.controllers;

import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.StockDTO;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public void create(@RequestBody ProductDTO productDTO) {
        service.create(productDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public List<ProductDTO> findAll() {
    List<ProductDTO> products = service.getAll();
    return products;
    }

    @PatchMapping
    public void update(@RequestBody StockDTO stockDTO) {
        service.update(stockDTO);
    }
}
