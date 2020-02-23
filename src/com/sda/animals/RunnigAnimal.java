package com.sda.animals;

public interface RunnigAnimal {

    void run();

    default void howFastItRuns(){
        System.out.println("Running...");
    };

}
