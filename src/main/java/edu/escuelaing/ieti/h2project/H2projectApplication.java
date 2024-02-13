package edu.escuelaing.ieti.h2project;

import edu.escuelaing.ieti.h2project.model.Country;
import edu.escuelaing.ieti.h2project.service.CountryService;
import edu.escuelaing.ieti.h2project.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2projectApplication {

	@Autowired
	CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(H2projectApplication.class, args);

	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return (args) -> {

			System.out.println("Adding countries....\n");
			countryService.save(new Country("Colombia"));
			countryService.save(new Country("Brasil"));

			System.out.println("\nGetting all counties....");
			countryService.all().forEach(System.out::println);

		};
	}


}
