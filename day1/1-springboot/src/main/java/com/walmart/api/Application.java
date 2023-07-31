package com.walmart.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.walmart.api.cupon.entry.Cupon;
import com.walmart.api.cupon.repository.CuponRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Cupon cupon = new Cupon();
		cupon.setCuponCode("10 disc");
		cupon.setDiscount(10);
		cupon.setId("1");
		
		CuponRepository repository = context.getBean(CuponRepository.class);
		repository.save(cupon);
		
	}

}
