package com.finology.model;

import lombok.Getter;
import lombok.Setter;
import utils.CarConstants;

public class SportCar implements Car{
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
	private int horsePower ; 
	@Setter
	@Getter
	private boolean fullSpecs; 
	@Setter
	@Getter
	private int numberOfDoors; 
	
	public SportCar ()
	{
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
