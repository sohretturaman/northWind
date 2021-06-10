package com.example.northwind2.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id

    @Column(name="category_id")
    private int categoryId ;

    @Column(name="category_name")
    private String categoryName ;

    @OneToMany(mappedBy = "category")
    private List<Product> products ;

    public Category(int categoryId, String categoryName, List<Product> products) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.products = products;
    }

    public Category() {
    }
}
