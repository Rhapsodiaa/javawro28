package com.sda.carexecrcises;

public class Truck extends Car{

    private double load;

    public Truck(String brandOfNewCar){
        super(brandOfNewCar);
        this.load = 0;
    }

    public void setLoad(double load){

        reportRange();

        this.load = load;
    }

    public void addLoad(double loadToAdd){
        this.load += loadToAdd;
    }

}
