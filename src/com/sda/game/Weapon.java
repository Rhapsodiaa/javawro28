package com.sda.game;

public abstract class Weapon {

    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    abstract int damage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
