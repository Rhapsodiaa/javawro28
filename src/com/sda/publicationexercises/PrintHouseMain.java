package com.sda.publicationexercises;

import java.util.Random;

public class PrintHouseMain {

    private static PrintHouse printHouse = new PrintHouse();

    public static void main(String[] args) {

        Publication[] publications = generatePublications(1000);

        double summedTime = printHouse.printAll(publications);

        System.out.println(summedTime);

    }

    private static Publication[] generatePublications(int howMany){
        Publication[] publications = new Publication[howMany];

        for (int i = 0; i < publications.length; i++) {
            publications[i] = generateRandomPublication();
        }

        return publications;

    }

    public static Publication generateRandomPublication() {
        Random random = new Random();
        double randomDouble = random.nextDouble();

        if (randomDouble < 0.5) {
            return new Book();
        } else {
            return new Newspaper();
        }

    }

}
