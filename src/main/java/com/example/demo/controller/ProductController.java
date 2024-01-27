package com.example.demo.controller;

import com.example.demo.model.ProductEntity;
import com.example.demo.service.ProductService;
import com.example.demo.service.abscrtaction.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    @Qualifier("redis")
    CacheService cacheService;

    @PostMapping("/products")
    public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductEntity productEntity) {
        System.out.println(productEntity.getTitle());
        ProductEntity product = productService.saveProduct(productEntity);
        cacheService.saveCache();
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductEntity>> getProducts() {
        ProductEntity product1 = new ProductEntity();
        product1.setTitle("Product 1");
        product1.setDescription("Product 1 Description");

        ProductEntity product2 = new ProductEntity();
        product2.setTitle("Product 2");
        product2.setDescription("Product 2 Description");

        return new ResponseEntity<>(List.of(product1, product2), HttpStatus.OK);
    }
}
