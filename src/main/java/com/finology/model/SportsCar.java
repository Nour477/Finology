package com.finology.model;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import utils.CarConstants;
import utils.CarType;

public class SportsCar implements Car {
	@Getter
	private String id;
	@Setter
	@Getter
	private boolean turbo;
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

	public SportsCar() {
		this.id = UUID.randomUUID().toString();
		this.carType=CarType.SPORT; 
		this.setTurbo(true);
		this.setColor(CarConstants.BLUE);
		this.setFullSpecs(true);
		this.setHorsePower(150);
		this.setNumberOfDoors(4);
		this.setWheelsCount(4);
	}

	@Override
	public void build() {
		System.out.println("Build Sport Car");
	}

}
