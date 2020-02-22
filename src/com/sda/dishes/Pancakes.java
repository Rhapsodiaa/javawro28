package com.sda.dishes;

public class Pancakes extends Dish {

    public Pancakes(double weight) {
        super(weight);
    }

    @Override
    void serve() {
        System.out.println("Serwowanie naleśników");
    }
}
