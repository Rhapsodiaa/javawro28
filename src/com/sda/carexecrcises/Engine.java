package com.sda.carexecrcises;

import java.util.Random;

public class Engine {
    private double volume;
    private double power;
    private FuelType fuelType;

    public Engine(double power, FuelType fuelType) {
        this.power = power;
        this.fuelType = fuelType;
        this.volume = new Random().nextDouble() * 100;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getVolume() {
        return volume;
    }

    public double getPower() {
        return power;
    }
}
