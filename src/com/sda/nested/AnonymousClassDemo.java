package com.sda.nested;

import com.sda.car.Drivable;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Drivable scooter = new Drivable() {
            @Override
            public void drive() {
                System.out.println("to jest jakaś anonimowa hulajnoga");
            }

            @Override
            public double getCurrentVelocityInKmPerHour() {
                return 10;
            }
        };
    }
}
