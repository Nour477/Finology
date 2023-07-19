package com.finology.model;

import lombok.Getter;
import lombok.Setter;
import utils.CarConstants;

public class ElectricCar implements Car{
	@Setter
	@Getter
	private int batteryVolume ; 
	@Setter
	@Getter
	private int wheelsCount; 
	@Setter
	@Getter
	private String color; 
	@Setter
	@Getter
	private int horsePower ; 
	@Setter
	@Getter
	private boolean fullSpecs; 
	@Setter
	@Getter
	private int numberOfDoors; 
	
	public ElectricCar ()
	{
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
