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

}




		// public List< Product> getAll (){
		//return  this.productService.getAll();









