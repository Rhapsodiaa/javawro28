package com.sda.publicationexercises;

import com.sda.publicationexercises.PrintHouse;

import static com.sda.publicationexercises.PrintHouseMain.generateRandomPublication;

public class PrintHousePriceMain {

    private static PrintHouse printHouse = new PrintHouse();


    public static void main(String[] args) {
        Publication publication = generateRandomPublication();

        publication.setPageCount(100);

        double finalPrice = printHouse.calculatePrice(publication);

        System.out.println(finalPrice);
    }

}
