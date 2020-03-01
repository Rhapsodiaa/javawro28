package com.sda.carexecrcises;

public class Car extends Object{

    private String brand;
    private int range;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String brandOfNewCar){
        this.brand = brandOfNewCar;
    }

    public Car(String brandOfNewCar, double power, FuelType fuelType) {

        this.brand = brandOfNewCar;
        this.range = 0;
        this.engine = new Engine(power, fuelType);
        this.wheels = new Wheel[4];

        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }

    public Car(String brand, int range) {
        this.brand = brand;
        this.range = range;
    }

    public void drive(int rangeToAdd){
        this.range = this.range + rangeToAdd;
    }

    public void reportRange(){
        System.out.println(this.brand + " : " +this.range);
    }

    public void carSound(){
        System.out.println("Standard brum");
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getRange() {
        return range;
    }
}
