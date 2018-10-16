package com.ecommerce.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;*/

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		/*ConfigurableEnvironment environment = new StandardEnvironment();
		environment.setDefaultProfiles("dev","prod");*/
		SpringApplication.run(EcomApplication.class, args);
	}
}
