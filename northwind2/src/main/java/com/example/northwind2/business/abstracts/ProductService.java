package com.example.northwind2.business.abstracts;

import com.example.northwind2.core.utilities.results.DataResult;
import com.example.northwind2.core.utilities.results.Result;
import com.example.northwind2.entities.concretes.Product;
import com.example.northwind2.entities.concretes.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    Result add ( Product product);

    DataResult<List<Product>> getAll(int pageNo, int pageSize); // hangi sayfa ve kaç öğe var

    DataResult<List<Product>> getAllSorted(); // istediğim şartlara  göre sırala

    DataResult<Product>  getByProductName(String productName);

    DataResult <Product> getByProductNameAndCategoryId( String productName, int categoryId);  // burda category_categoryId yi silip categoryId bırakıyoruz
                                                                                                // işlem yapılacak oaln o fakat product dao da jpa bunu kabul etmediği öyle tanımaldık çünkücategory id ve product id aradında ONeToMany ilişkisi vardır
    DataResult<List<Product>> getByProductNameOrCategoryId( String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIdIn( List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith( String productName);

    DataResult<List<Product>> getByNameAndCategory ( String productName,int categoryId) ;  // query yi sildik

    DataResult<List<ProductWithCategoryDto>>getProductWithCategoryDetails ();
}
