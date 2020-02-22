package com.sda.car;

public class Wheel {
    private double diameterInInches;
    private String manufacturer;
    private double actualPressure;

    public Wheel() {
        this.diameterInInches = 15;
        this.manufacturer = "Goodyear";
        this.actualPressure = 1.8;
    }

    private void pumpItUp(){
        this.actualPressure += 0.1;
    }
}
