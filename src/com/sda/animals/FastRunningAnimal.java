package com.sda.animals;

public interface FastRunningAnimal extends RunnigAnimal {


    void runFast();

    @Override
    default void howFastItRuns() {
        System.out.println("Running fast...");
    }
}
