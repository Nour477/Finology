package com.finology.model;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import utils.CarConstants;
import utils.CarType;

public class ElectricCar implements Car {
	@Getter
	private String id;
	@Setter
	@Getter
	private int batteryVolume;
	@Setter
	@Getter
	private int wheelsCount;
	@Setter
	@Getter
	private String color;
	@Setter
	@Getter
	private int horsePower;
	@Setter
	@Getter
	private boolean fullSpecs;
	@Setter
	@Getter
	private int numberOfDoors;
	@Setter
	@Getter
	private CarType carType;

	public ElectricCar() {
		this.id = UUID.randomUUID().toString();
		this.carType = CarType.ELECTRIC;
		this.setBatteryVolume(200);
		this.setColor(CarConstants.RED);
		this.setFullSpecs(true);
		this.setHorsePower(150);
		this.setNumberOfDoors(4);
		this.setWheelsCount(4);
	}

	@Override
	public void build() {
		System.out.println("Build Electric Car");
	}

}
