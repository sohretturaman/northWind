package com.example.northwind2.business.concretes;

import com.example.northwind2.business.abstracts.ProductService;
import com.example.northwind2.core.utilities.results.DataResult;
import com.example.northwind2.core.utilities.results.Result;
import com.example.northwind2.core.utilities.results.SuccessDataResult;
import com.example.northwind2.core.utilities.results.SuccessResult;
import com.example.northwind2.dataAccess.abstracts.ProductDao;
import com.example.northwind2.entities.concretes.Product;
import com.example.northwind2.entities.concretes.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao ;

    @Autowired
    public ProductManager(ProductDao productDao ){
        super();
        this.productDao = productDao ;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult< List<Product>>
                ( this.productDao.findAll()," data başarıyla listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product ) ;
        return new SuccessResult("ürün  ekelendi");
    }

 // bu iki method sayfa sıralmak için yazıldı
    @Override
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of( pageNo,pageSize); // sayfa listelemk için bu kod kullanılır.

        return new SuccessDataResult<List<Product>>
                ( this.productDao.findAll(pageable).getContent()); // getContent içerik görüntülemek için
    }

    @Override
    public DataResult<List<Product>> getAllSorted() {

        Sort sort = Sort.by(Sort.Direction.DESC,"productName"); // buüyükten küçüğe sırala demek properties i yazmayı unutma
        return new SuccessDataResult<List<Product>>
                ( this.productDao.findAll(sort),"sıralama başarılı  "); // getContent burda yok
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>
                (this.productDao.getByProductName(productName), "Data listelendi");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId (String productName, int categoryId) {
        return  new SuccessDataResult<Product >
                (this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId) , "Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (this.productDao.getByProductNameOrCategory_CategoryId(productName,categoryId) , "Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product> >(this.productDao.getByCategoryIn(categories) , "Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult <List<Product>>
                (this.productDao.getByProductNameContains(productName)  , "Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>
                (this.productDao.getByProductNameStartsWith(productName)  , "Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (this.productDao.getByNameAndCategory(productName,categoryId)  , "Data listelendi");
    }

    @Override
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return new SuccessDataResult< List<ProductWithCategoryDto>>
                ( this.productDao.getProductWithCategoryDetails()," data başarıyla listelendi");
    }


}
