package com.example.northwind2.entities.concretes;

import com.example.northwind2.entities.concretes.Category;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="product_id")
    private int id ;

    // @Column(name="category_id")
    // private int  categoryId ;

    @Column(name="product_name")
    private String productName ;

    @Column(name="unit_price")
    private double unitPrice ;

    @Column(name="units_in_stock")
    private short unitsInStock ;

    @Column (name="quantity_per_unit")
    private  String  quantityPerUnit ;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category ;

    public Product(int id, String productName, double unitPrice, short unitsInStock, String quantityPerUnit, Category category) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
        this.category = category;
    }

    public Product() {
    }
}
