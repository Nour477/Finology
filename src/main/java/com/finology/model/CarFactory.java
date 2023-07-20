package com.finology.model;

import utils.CarType;

public class CarFactory {
	public Car create(CarType type) {

		if (type == null || type.toString().isEmpty())
			return null;
		switch (type) {
		case ELECTRIC:
			return new ElectricCar();
		case SPORT:
			return new SportsCar();
		case TWOWWHEELS:
			return new TwoWheelsCar();
		default:
			throw new IllegalArgumentException("Unknown type " + type.toString());
		}
	}
}