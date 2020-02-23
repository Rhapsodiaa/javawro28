package com.sda.animals;

public class Gepard implements FastRunningAnimal {
    @Override
    public void runFast() {

    }

    @Override
    public void run() {

    }

    @Override
    public void howFastItRuns() {

    }

    public void roar(){}


    public static void main(String[] args) {
        FastRunningAnimal animal = new Gepard();

        animal.run();
        animal.runFast();
        animal.howFastItRuns();

    }
}
