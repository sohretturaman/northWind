package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entites.concretes.Product;

import java.util.List;

public interface ProductService {

    DataResult < List <Product> > getAll();
    DataResult <List< Product>> getAll ( int pageNo , int pageSize) ; // hangi sayfa ve bir sayfada kaç data var onun bilgisi için tanımlıyoruz

    DataResult < List <Product> > getAllSorted(); // istediğim şartlara göre sırala

     Result  add ( Product product) ;

    //List<Product> getAll();
    // ProductDao daki tüm fonkdiyonları buraya ekliyoruz bunlar bir data döndüreceği için hepsine dataAccess ekle

    DataResult <Product> getByProductName ( String productName) ;
    DataResult<Product> getByProductNameAndCategoryId ( String productName,int categoryId) ;
    DataResult <List < Product >> getByProductNameOrCategoryId ( String productName, int categoryId) ;

    DataResult< List < Product >> getByCategoryIdIn ( List<Integer> categories) ;
    DataResult<List < product>> getByProductNameContains ( String productName) ;
    DataResult<List< Product>> getbyProductNameStartsWith ( String productname);

    DataResult<List < Product>> getByNameAndCategory( String ProductName, int categoryId);  // üstteki query silinidi
}
