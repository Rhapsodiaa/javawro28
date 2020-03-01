package com.sda.finaldemo;

import com.sda.carexecrcises.Car;

public class FinalDemo {

    final Car car;

    public FinalDemo(String car) {
        this.car = new Car("Skoda");

        this.car.reportRange();
        this.car.drive(10);
        this.car.reportRange();


    }



}
