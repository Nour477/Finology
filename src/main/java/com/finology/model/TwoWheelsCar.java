package com.finology.model;

import lombok.Getter;
import lombok.Setter;
import utils.CarConstants;

public class TwoWheelsCar implements Car{

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
	
	public TwoWheelsCar ()
	{
		this.setColor(CarConstants.BLACK);
		this.setFullSpecs(true);
		this.setHorsePower(150);
		this.setNumberOfDoors(4);
		this.setWheelsCount(4);
	}
    @Override
    public void build() {
        System.out.println("Build TwoWheels Car");
    }

}
