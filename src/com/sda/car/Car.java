package com.sda.car;

import java.util.Arrays;

public class Car implements Comparable<Car>{

    private Lights lights;
    private Engine engine;
    private Wheel[] wheels = new Wheel[4];

    public Car() {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }

        this.engine = new Engine(1600);
        this.lights = new Lights("LED");
    }

    public void drive(){
        this.lights.lightItUp();
        this.engine.faster(10);
    }


    private void changeWheel(int wheelNumber, Wheel newWheel){
        this.wheels[wheelNumber] = newWheel;
    }

    @Override
    public int compareTo(Car other) {
        if(this.engine.getVolumeInCm3() < other.engine.getVolumeInCm3()){
            return -1;
        };
        if(this.engine.getVolumeInCm3() > other.engine.getVolumeInCm3()){
            return 1;
        }
        return 0;
    }

    public Lights getLights() {
        return lights;
    }

    @Override
    public String toString() {
        return "Car{" +
                "lights=" + lights +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }


}
