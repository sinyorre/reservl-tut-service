package com.example.demo.service;

import com.example.demo.model.ProductEntity;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductEntity saveProduct(ProductEntity productEntity) {
        productEntity.setTitle(productEntity.getTitle().concat(" - TRENDYOL"));
        return productRepository.save(productEntity);
    }
}
