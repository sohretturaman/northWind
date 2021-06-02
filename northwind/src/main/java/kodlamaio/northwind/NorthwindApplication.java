package kodlamaio.northwind;





import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class NorthwindApplication<Docket> {


	public static  void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);

	}


	// proje çalışıyor fakat  swagger ekelerken eclipse de eklenmesi gereken  iki dependency yerine tek bir tane eklendi
	// main de eklenmesi gereken bean eklentisi ki bu eclipsede eklendikten sonra swagger eclipseye import aracılığıyla enjekte edildi fakat burda  farklı bir şekilde eklendi
	// bu şöyle tools => generate swagger => confirm =>click project and reload from disk => docs klasörü oluşur ve böylece eklendi
	// ayrıca lombok kısmında allArgsContructor ve noArgsConstructor eklenmedi onlar olmadan çalışıyor ve ide de bakıldığında tüm lombok işlevlerinde görünmüyor
	// (intellij ide )

}
