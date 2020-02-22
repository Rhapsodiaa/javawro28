package com.sda.animals; //deklaracja pakietu

import java.util.ArrayList; //importy
import java.util.List;

public class Dog { //modyfikator dostępu + nazwa klasy

    private String name; //pola klasy (stan klasy)
    private double heightInCm;
    private List<Dog> children;

    public Dog(String name) { //konstruktor
        this.name = name;
        this.children = new ArrayList<>();
    }

    public Dog(String name, double heightInCm) { //konstruktor
        this.name = name;
        this.heightInCm = heightInCm;
    }

    //poniżej są metody (zachowania)

    public void growBy(double cmToGrow){
        this.heightInCm = this.heightInCm + cmToGrow;
    }

    public void bark(){
        System.out.println("HAU HAU");
    }

    public String createCommand(String command){
        return this.name + " " + command;
    }
}
