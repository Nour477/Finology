package com.finology.model;

public class TwoWheelsCarFactory extends CarFactory {
    @Override
    protected Car createCar() {
        return new TwoWheelsCar();
    }
}