package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class ProductEntity {
    @Id
    private String id;
    private String title;
    private String description;
    private long deci;
}
