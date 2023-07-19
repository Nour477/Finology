package com.finology.model;

public abstract class CarFactory {
    public Car create() {
        Car car = createCar();
        car.build();
        return car;
    }
    protected abstract Car createCar();
}