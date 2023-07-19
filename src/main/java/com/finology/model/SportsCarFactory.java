package com.finology.model;

public class SportsCarFactory extends CarFactory {
    @Override
    protected Car createCar() {
        return new SportCar();
    }
}