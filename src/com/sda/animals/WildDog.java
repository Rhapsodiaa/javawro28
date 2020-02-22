package com.sda.animals;

public class WildDog extends Dog {

    private int dangerLevel;

    public WildDog(String name) {
        super(name);
    }

    public WildDog(String name, int dangerLevel) {
        super(name);
        this.dangerLevel = dangerLevel;
    }

    @Override
    public void bark() {
        System.out.println("I AM WILD BAAAAAAARK");
    }

    public void attack() {
        super.bark();
        System.out.println("HAU HAU");
        this.dangerLevel++;
    }
}
