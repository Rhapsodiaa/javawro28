package com.sda.publicationexercises;

public class PrintHouse {

    //returns sum of all print() methods from publications
    public double printAll(Publication[] publications){
        double actualSum = 0;
        for (Publication publication : publications) {
            double partialPrintTime = publication.print();
            actualSum += partialPrintTime;
        }
        return actualSum;
    }


    public double calculatePrice(Publication publication){
        return publication.calculatePrice();
    }

}
