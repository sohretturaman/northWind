package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entites.concretes.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/products") // gelen istekleri kontrol eder

public class ProductsController {
	
	private ProductService productService ;
	
	@Autowired
	public ProductsController ( ProductService productService ) {
		this.productService =productService;
	}
	
@GetMapping ("/getall")
   public DataResult <List< Product>> getAll (){
	return  this.productService.getAll();
}
@PostMapping("/add")
   public Result add( @RequestBody Product product){  // requestBody  senin verdiğin veriyi   post eder
		 return this.productService.add(product);
   }


   @GetMapping("/ getByProductName") // ismi aynen yaz
	public DataResult < Product> getByProductName (@RequestParam String ProductName ){  //yapılan isteğim parametresini oku ona göre veri getir
		this.productService.getByProductName(ProductName);
	}

	@GetMapping("/getByProductNameAndCategoryId ")
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String ProductName, @RequestParam int categoryId){
		return this.productService.getByProductNameAndCategoryId (ProductName,categoryId);
	}

	@GetMapping("/getByProductNameContains ")
	 public DataResult<List < product>> getByProductNameContains (@RequestParam String productName){
		return this.productService.getByProductNameContains(productName );
	}

	@GetMapping("/getAllByPage ")
	DataResult <List< Product>> getAll ( int pageNo-1 , int pageSize){ // sıralamya 0 dan başlar
  return this.productService.getAll(pageNo ,pageSize);
	}

	@GetMapping("/getAllDesc ")
	 public DataResult < List <Product> > getAllSorted(){
		return this.productService.getAllSorted();
	}
}




		// public List< Product> getAll (){
		//return  this.productService.getAll();









