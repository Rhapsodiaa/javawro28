package com.sda.carexecrcises;

public class InheritanceDemo {

    public static void main(String[] args) {

        Car star = new Truck("Star");

        Car ferrari = new RaceCar("Ferrari");

        Car[] myCars = new Car[2];
        myCars[0] = ferrari;
        myCars[1] = star;

        reportRanges(myCars);

    }

    private static void reportRanges(Car[] cars){
        for (Car car : cars) {
            car.reportRange();
        }
    }

}
