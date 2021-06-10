package com.example.northwind2.api;

import com.example.northwind2.business.abstracts.ProductService;
import com.example.northwind2.core.utilities.results.DataResult;
import com.example.northwind2.core.utilities.results.Result;
import com.example.northwind2.entities.concretes.Product;
import com.example.northwind2.entities.concretes.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/products")

public class ProductController {

    private ProductService productService ;

    @Autowired
    public ProductController (ProductService productService  ){
        this.productService = productService ;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }



    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails()
    {
        return this.productService.getProductWithCategoryDetails();
    }




    @PostMapping("/add")
     public Result add (@RequestBody Product product){
        return  this.productService.add(product) ;
    }

    @GetMapping("getByProductName")
     public DataResult<Product>  getByProductName(@RequestParam String productName){
        return this.productService.getByProductName(productName);
     }


    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult <Product> getByProductNameAndCategoryId(@RequestParam String productName,@RequestParam int categoryId){
        return this.productService.getByProductNameAndCategoryId(productName,categoryId);
    }

    @GetMapping("/getByProductNameContains")
     public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
        return this.productService.getByProductNameContains(productName);
    }


    @GetMapping("/getAllByPage")
    public DataResult<List<Product>> getAll(int pageNo, int pageSize){
        return this.productService.getAll(pageNo, pageSize) ;
    }

    @GetMapping("/getAllDesc")
    public DataResult<List<Product>> getAllSorted(){
        return this.productService.getAllSorted();
    }
}
