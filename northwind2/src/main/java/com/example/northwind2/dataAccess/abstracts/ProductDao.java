package com.example.northwind2.dataAccess.abstracts;

import com.example.northwind2.entities.concretes.Product;
import com.example.northwind2.entities.concretes.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {

    Product getByProductName(String productName);// burda *getBy * önemli  onu yazdıktan sonra *kolonların adını* ekliyoruz böylede jpa respository bizim yerimize  bu işlemi yapıyor

    Product getByProductNameAndCategory_CategoryId( String productName, int categoryId);     // category nin categoryId kısmı nı alır

    List<Product> getByProductNameOrCategory_CategoryId( String productName, int categoryId);

    List<Product> getByCategoryIn( List<Integer> categories);     // burda product listesinden integer türnde categories getiri
    // select * from products where category_id in( 1,2,3,4) benzeri yukarda // bir postgre kodu

   List<Product> getByProductNameContains(String productName);    // eğer  o ismi içriyorsa

   List<Product> getByProductNameStartsWith( String productName); // eğer o isimle başlıyorsa

    @Query("From Product where productName=:productName and category.categoryId=:categoryId")  //benim product daki alanlarım burda veri tabanını unut  değeri parametrelere atıyoruz
    List<Product> getByNameAndCategory ( String productName,int categoryId) ;  // bunun postgre deki değeri // select * from procuts where product_name=bişey and category_id=bişey

    // önemli bir jpql sorgusu sql sorgusundaki on yazılmadı ona gerek kalmıyor .
    @Query("Select new  com.example.northwind2.entities.concretes.dtos.ProductWithCategoryDto" +
            "(p.id,p.productName,c.categoryName)" +
            " From Category c Inner join c.products p ")
    List<ProductWithCategoryDto> getProductWithCategoryDetails ();
   // sql= slect p.product_id,p.product_name,c.category_id from categories c  inner join prodcuts p
    // on c.category_id=p.product_id


 }
