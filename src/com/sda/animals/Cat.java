package com.sda.animals;

public class Cat extends Animal {

    public Cat(int age) {
        super(age);
    }

    @Override
    void live() {

    }

    @Override
    void getSound() {
        System.out.println("Miau..");
    }
}
