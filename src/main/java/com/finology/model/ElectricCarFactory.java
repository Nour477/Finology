package com.finology.model;

public class ElectricCarFactory extends CarFactory {
    @Override
    protected Car createCar() {
        return new ElectricCar();
    }
}