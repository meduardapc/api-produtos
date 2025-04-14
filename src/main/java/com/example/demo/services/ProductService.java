package com.example.demo.services;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
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

    @Transactional
    public List<ProductDTO> getAll() {
        List<Product> productList = repository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();

        productList.forEach(product -> {
            ProductDTO dto = new ProductDTO(product);
            productDTOList.add(dto);
        });
        return productDTOList;
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
