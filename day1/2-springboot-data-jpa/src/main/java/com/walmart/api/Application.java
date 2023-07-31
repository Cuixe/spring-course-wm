package com.walmart.api;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.walmart.api.cupon.entry.Cupon;
import com.walmart.api.cupon.repository.CuponRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		CuponRepository repository = context.getBean(CuponRepository.class);
		int option = 4;
		switch(option) {
		case 1:
			Cupon newCupon = new Cupon();
			newCupon.setCuponCode("10 disc");
			newCupon.setDiscount(10);
			newCupon.setId("1");
			repository.save(newCupon);
			break;
		case 2:
			Cupon findedCupon = repository.findById("1").get();
			assert findedCupon != null;
			assert findedCupon.getCuponCode().equals("10 disc");
			break;
		case 3:
			List<Cupon> allCupons = repository.findAll();
			assert allCupons.size() > 0;
			break;
		case 4:
			Cupon cuponToUpdate = repository.findById("1").get();
			cuponToUpdate.setCuponCode("20 disc");
			cuponToUpdate.setDiscount(20);
			repository.save(cuponToUpdate);
			
			Cupon updatedCupon = repository.findById("1").get();
			assert updatedCupon.getCuponCode().equals("20 disc");
			break;
		case 5:
			repository.deleteById("1");
			List<Cupon> remainingCupons = repository.findAll();
			assert remainingCupons.size() == 0;
			break;
		}
	}
}
