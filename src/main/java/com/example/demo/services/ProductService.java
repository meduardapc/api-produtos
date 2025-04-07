package com.example.demo.services;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional
    public ProductDTO findById(Long id) {
        Product entity = repository.findById(id).get();
        ProductDTO dto = new ProductDTO(entity);
        return dto;
    }

    public void create(ProductDTO productDTO) {
        Optional<Product> productOptional = repository.findByName(productDTO.getName());

        if(productOptional.isEmpty()){
            Product product = new Product();
            product.setName(productDTO.getName());
            repository.save(product);
        }
    }

    public void delete(Long id) {
        Optional<Product> productOptional = repository.findById(id);

        if(productOptional.isPresent()) {
            repository.delete(productOptional.get());
        }
    }
}
