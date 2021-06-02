package kodlamaio.northwind.business.concretes;




import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.entites.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.dataAccess.abstracts.ProductDao;

import java.util.List;

@Service
public class ProductManager  implements ProductService {
	private ProductDao productDao;


	@Autowired
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>
				(this.productDao.findAll(), "data listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult(" ürün eklendi ");
	}

	@Ovverride
	public DataResult < Product> getByProductName (String ProductName ){
		return new SuccessDataResult<Product>  // tek product çekiyoruz list sildik yukardan kopyala yapıştır
				(this.productDao.getByProductName(productName), "data listelendi"); // productDao  dan  aynı isimde fonksiyon çekiyoruz
	}

	@Ovverride
	public DataResult<Product> getByProductNameAndCategoryId(String ProductName, int categoryId){
		// business codes yazılabilir
		return new SuccessDataResult<Product>
				(this.productDao.getByProductNameAndCategory_CategoryId( productName,categoryId), "data listelendi");
}

	@Ovverride
   public DataResult< List < Product> > getByProductNameOrCategoryId( String  productName, int categoryId){
		return new SuccessDataResult<List<Product>>
				(this.productDao.getByProductNameOrCategory_CategoryId ( productName,categoryId), "data listelendi");
  }

	@Ovverride
  public DataResult < list < Product>> getByCategoryIdIn ( Lİst< Integer> categories){
	  return new SuccessDataResult<List<Product>>
			  (this.productDao.getByCategoryIn( categories), "data listelendi");
  }

	@Ovverride
	public DataResult< List < Product> > getByProductNameContains(String ProductName){
		return new SuccessDataResult<List<Product>>
				(this.productDao.getByProductNameContains(ProductName ), "data listelendi");
	}

	@Ovverride
	public DataResult< List < Product> > getByProductNameStartsWith(String ProductName){
		return new SuccessDataResult<List<Product>>
				(this.productDao.getByProductNameStartsWith(ProductName ), "data listelendi");
	}


	@Ovverride
	public DataResult< List < Product> > getByNameAndCategory (String ProductName, int categoryId ){
		return new SuccessDataResult<List<Product>>
				(this.productDao.getByNameAndCategory(ProductName, categoryId), "data listelendi");
	}

	@Ovverride
	 public DataResult <List< Product>> getAll ( int pageId , int pageSize){
		Pageable  pageable = PageRequest.of(pageNo , pageSize);
		return  new SuccessDataResult<List<Product>>
				(this.productDao.findAll(pageable).getContent()," işlem başarılı ");
	}

	@Ovverride
	 public DataResult < List <Product> > getAllSorted(){
		Sort sort = Sort.by(Sort.Direction.DESC," productName") // alanını eklemeyi unutma product name sıralanacak
		return  new SuccessDataResult<List<Product>>
				(this.productDao.findAll(sort), "başarılı");
	}
}
// public List< Product> getAll();
//return  this.productDao.findAll();