package com.sda.interfacedemo;

public class NescafeCafeMachine implements CafeMachine {
    @Override
    public Cafe[] showMenu() {
        Cafe[] menu = {
                new Cafe("Nescafe Biała", 3),
                new Cafe("Nescafe Czarna", 4),
        };

        return menu;
    }

    @Override
    public void chooseCafe(Cafe cafe) {
        System.out.println("Wybrałeś:" + cafe.getName());
        System.out.println("Do zapłaty:" + cafe.getPrice());
    }

    @Override
    public Cafe makeCafe(double money, Cafe cafe) {
        if (money >= cafe.getPrice()) {
            System.out.println("Przygotowanie kawy " + cafe.getName());
            System.out.println("Wydawanie reszty...");

            double change = money - cafe.getPrice();

            System.out.println("Reszta: " + change);
            return cafe;
        } else {
            System.out.println("Niewystarczająca ilość monet");
            double missingMoney =  cafe.getPrice() - money;
            System.out.println("Brakuje: " + missingMoney);

            return null;
        }
    }
}
