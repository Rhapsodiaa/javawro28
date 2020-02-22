package com.sda.dishes;

public abstract class Dish {

    public double weight;

    public Dish(double weight) {
        this.weight = weight;
    }

    abstract void serve();
}
