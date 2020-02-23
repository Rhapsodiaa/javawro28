package com.sda.animals;

public abstract class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    abstract void live();

    void getSound(){
        System.out.println("burk...");
    }

}
