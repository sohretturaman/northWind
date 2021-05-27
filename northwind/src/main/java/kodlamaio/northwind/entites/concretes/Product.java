package kodlamaio.northwind.entites.concretes;

import lombok.Data;

import javax.persistence.*;


@Entity // hangi katmana ait olduğunu belirt veri tabanı için

@Data
@Table ( name="products") // tablonun ismini söyleyin
public class Product {
	@Id                            // işlmeler id ye göre yapılır bu yüzden burda bu şekilde tanımlanır
	@GeneratedValue (strategy = GenerationType.IDENTITY)  //bu değeri vermen gerekir ki akabinde postRequest değeri  çalışabilsin ( localhost)    // veri tabanındaki veriler bir bir artırılacak
	//@AllArgsConstructor  => bu iki fonksiyonun çalıştırılması gerekmşyor
	//@NoArgsConstructor



	@Column ( name ="product_id")

    private int id ;
	
	@Column ( name =" category_id")  	// tabloda hangi kolona denk geldiğini belirtmek için column kullanılır
      private int categoryId ;
	
	@Column ( name =" product_name")
     private String productName ;
	
	@Column ( name =" unit_price")
      private double unitPrice ;
	
	@Column ( name =" units_in_stock")
  private short unitsInStock ;
	
	@Column ( name =" quantity_per_unit")
  private String quantityPerUnit ; 
	

	

	
	


	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 




















 
