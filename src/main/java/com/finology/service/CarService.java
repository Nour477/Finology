package com.finology.service;

import com.finology.model.Car;
import com.finology.model.CarFactory;

import utils.CarType;

public class CarService {

	public Car getNewCarFromType(String type) {
		CarFactory carFactory = new CarFactory();
		CarType carType = CarType.valueOf(type.toUpperCase());
		Car car = carFactory.create(carType);
		return car;

	}

}