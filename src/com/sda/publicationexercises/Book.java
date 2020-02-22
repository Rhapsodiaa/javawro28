package com.sda.publicationexercises;

public class Book extends Publication {

    @Override
    public double print(){
        System.out.println("Printing book...");
        return 10;
    }

}
