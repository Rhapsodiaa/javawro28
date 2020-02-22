package com.sda.carexecrcises;

public class CompositionDemo {
    public static void main(String[] args) {
        Car carWithWheels = new Car(
                "Skoda",
                100,
                "LPG"
        );

        Wheel[] wheels = carWithWheels.getWheels();

        System.out.println(wheels);

        Car carWithoutWheels = new Car("Mazda");

        Wheel[] anotherWheels = carWithoutWheels.getWheels();

        System.out.println(anotherWheels);

    }
}
