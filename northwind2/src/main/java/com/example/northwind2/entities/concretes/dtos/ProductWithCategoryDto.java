package com.example.northwind2.entities.concretes.dtos;

import lombok.Data;

@Data
public class ProductWithCategoryDto {
    private int id ;
    private String productName;
    private String categoryId;

    public ProductWithCategoryDto() {
    }



    public ProductWithCategoryDto(int id, String productName, String categoryId) {
        this.id = id;
        this.productName = productName;
        this.categoryId = categoryId;
    }
}


