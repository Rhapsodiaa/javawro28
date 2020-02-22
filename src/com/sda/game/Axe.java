package com.sda.game;

public class Axe extends Weapon {

    private int weight;

    public Axe(String name) {
        super(name);
        this.weight = 20;
    }


    @Override
    int damage() {
        return 50;
    }

}
