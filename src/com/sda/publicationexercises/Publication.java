package com.sda.publicationexercises;

public class Publication {

    private int pageCount;

    public double print(){
        System.out.println("Printing publication...");
        return 5;
    }

    public double calculatePrice(){
        return pageCount * 0.15;
    }

    public void setPageCount(int pageCount) {

        this.pageCount = pageCount + 10;
    }
}
