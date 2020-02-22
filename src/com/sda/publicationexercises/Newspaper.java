package com.sda.publicationexercises;

public class Newspaper extends Publication {
    @Override
    public double print() {
        System.out.println("Printing newspaper...");
        return 2;
    }
}
