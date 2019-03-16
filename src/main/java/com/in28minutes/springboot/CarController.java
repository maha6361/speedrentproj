package com.in28minutes.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

	
	@RequestMapping("/welcome")
	public List<Car> getAllCar(){
		return Arrays.asList(
				new Car("Proton","Saga")
				//new Car("Perodua","Myvi")				
				);
	}
}
