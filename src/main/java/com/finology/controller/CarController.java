package com.finology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.finology.model.Car;
import com.finology.service.CarService;

@RestController
public class CarController {

	@Autowired
	private CarService carService;

	@GetMapping(value = "/car/{type}")
	public Car createCarByType(@PathVariable String type) {
		return carService.getNewCarFromType(type);

	}

}
