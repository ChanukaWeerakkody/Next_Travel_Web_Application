package lk.ijse.gdse.Package;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PackageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackageApplication.class, args);
	}

	@Bean
	ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
