package com.example.demo;

import java.sql.DriverPropertyInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.loose.CoffeeMaker;
import com.example.loose.DripCoffeeMachine;
import com.example.loose.EspressoMachine;

//import com.example.tight.CoffeeMaker;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		//tight
		//CoffeeMaker coffeeMaker = new CoffeeMaker();
		//coffeeMaker.makeCoffee();
		
		// loose
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		//coffeeMaker.setCoffeeMaker(new EspressoMachine());
		coffeeMaker.setCoffeeMaker(new DripCoffeeMachine());
		coffeeMaker.makeCoffee();
	}

}
