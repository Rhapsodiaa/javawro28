package com.sda.carexecrcises;

public class Engine {
    private double volume;
    private double power;
    private FuelType fuelType;

    public Engine(double power, FuelType fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }
}
