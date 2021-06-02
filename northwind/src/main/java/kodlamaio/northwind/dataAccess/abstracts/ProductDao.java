package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entites.concretes.Product;

public interface ProductDao extends JpaRepository< Product,Integer>{
    //dataAccess tüm CRUD pperasyonları jpaRespository ile artık hazır .

	Product getByProductName ( String productName) ;
	Product getByProductNameAndCategory_CategoryId ( String productName,int categoryId) ; // category nin categoryId kısmı nı alır
    // burda *getBy * önemli  onu yazdıktan sonra *kolonların adını* ekliyoruz böylede jpa respository bizim yerimize  bu işlemi yapıyor
	List < Product > getByProductNameOrCategory_CategoryId( String productName, int categoryId) ; // categoryId silidik Id yi çünkü yok sildik onu

	List < Product > getByCategoryIn ( List<Integer> categories) ;
	// burda product listesinden integer türnde categories getiri

	// bir postgre kodu
	// select * from products where category_id in( 1,2,3,4) benzeri yukarda

	 List < product> getByProductNameContains ( String productName) ;
  // eğer  o ismi içriyorsa
	List< Product> getbyProductNameStartsWith ( String productname);
  //  seçtiğimiz isimle başlayanlar demek

	@Query( "*From Prodcut where productName=:productName and category.categoryId=:categoryId ")
	//benim product daki alanlarım burda veri tabanını unut  değeriparametrelere atıyoruz
	List < Product> getByNameAndCategory( String ProductName, int categoryId);

	// bunun postgre deki değeri
	// select * from procuts where product_name=bişey and category_id=bişey

}
