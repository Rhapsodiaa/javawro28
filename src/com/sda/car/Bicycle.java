package com.sda.car;

public class Bicycle implements Drivable, CanMakeSignal{
    @Override
    public void drive() {
        System.out.println("Jadę rowerem");
    }

    @Override
    public double getCurrentVelocityInKmPerHour() {
        return 20;
    }

    @Override
    public void makeSignal() {
        defaultBehaviour();
        System.out.println("Rower dzwoni");
    }
}
