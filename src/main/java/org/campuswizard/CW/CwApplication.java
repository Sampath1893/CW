package org.campuswizard.CW;

import org.campuswizard.controller.LoginController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = LoginController.class)
public class CwApplication {

	public static void main(String[] args) {
		SpringApplication.run(CwApplication.class, args);
	}

}
