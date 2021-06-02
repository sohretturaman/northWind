package kodlamaio.northwind.entites.concretes;

import lombok.Data;

import javax.persistence.*;


@Entity // hangi katmana ait olduğunu belirt veri tabanı için

@Data
@Table ( name="products") // tablonun ismini söyleyin
public class Product {
	@Id                            // işlmeler id ye göre yapılır bu yüzden burda bu şekilde tanımlanır
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//bu değeri vermen gerekir ki akabinde postRequest değeri  çalışabilsin ( localhost)    // veri tabanındaki veriler bir bir artırılacak
	//@AllArgsConstructor  => bu iki fonksiyonun çalıştırılması gerekmşyor
	//@NoArgsConstructor


//	@Column(name = "product_id")
//	private int id;  gerek kalmadı çünkü o diğer tabloya bağlandı

	@Column(name = " category_id")    // tabloda hangi kolona denk geldiğini belirtmek için column kullanılır
	private int categoryId;

	@Column(name = " product_name")
	private String productName;

	@Column(name = " unit_price")
	private double unitPrice;

	@Column(name = " units_in_stock")
	private short unitsInStock;

	@Column(name = " quantity_per_unit")
	private String quantityPerUnit;

	@ManyToOne()
	@JoinColumn ( name =" category_id")
	private Category category ;

}

// yeni bir class şuan eklenemiyor o yüzden burdan çalış projeyi baştan yap

@Data
@Entity
@Table ( name =" categories")
@JsonIgnoreProperties ({ "hibernateLazyInitializer","handler","products"}) // sonsuz döngüyü engellemek için
public class Category {

	@Id
	@Column ( name ="category_id ")
	private int categoryId ;

	@Column ( name =" category_name")
	private String categoryName ;

  @OneToMany( mappedBy ="category")
	private List<Product> products ;

}



	
	


	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 




















 
