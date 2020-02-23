package com.sda.interfacedemo;

public class TchiboCafeMachine implements CafeMachine {
    @Override
    public Cafe[] showMenu() {

        Cafe[]  menu = {
                new Cafe("Tchibo espresso", 10),
                new Cafe("Tchibo flat white", 20),
                new Cafe("Tchibo biała", 30),

        };

        return menu;
    }

    @Override
    public void chooseCafe(Cafe cafe) {
        System.out.println("SUPER!");
        System.out.println("Wybrano: " + cafe.getName());
    }

    @Override
    public Cafe makeCafe(double money, Cafe cafe) {
        return null;
    }
}
