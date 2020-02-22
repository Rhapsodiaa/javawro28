package com.sda.carexecrcises;

public class PolimorphismDemo {
    public static void main(String[] args) {

        Car regularCar = new Car("Skoda");
        RaceCar ferrari = new RaceCar("Ferrari");
        Car star = new Truck("Star");

        ferrari.mountTurbo();

        Car[] myCars = new Car[3];
        myCars[0] = ferrari;
        myCars[1] = star;
        myCars[2] = regularCar;

        turnOnAll(myCars);

    }

    public static void turnOnAll(Car[] cars){
        for (Car car : cars) {
            car.carSound();
        }
    }


}
