package com.sda.animals;


import com.sda.animals.Dog;
import com.sda.animals.WildDog;

import java.util.Random;

public class DogWorld {

    public static void main(String[] args) {

        Dog burek = new Dog("Burek");

        Dog dzikus = new WildDog("Dzikus");
        WildDog anotherDzikus = new WildDog("Inny dzikus");

        dzikus.bark();
        dzikus.createCommand("Skacz");
        dzikus.growBy(1);
        //dzikus.attack() nie działa!

        anotherDzikus.attack();


        System.out.println("\n===RANDOM DOG===");
        Dog randomDog = getRandomDog();
        randomDog.bark();
    }


    private static Dog getRandomDog(){
        Random random = new Random();
        if(random.nextDouble() < 0.5){
            return new WildDog("Wild");
        }
        return new Dog("Regular dog");
    }

}
