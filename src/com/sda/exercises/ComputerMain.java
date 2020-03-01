package com.sda.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;


public class ComputerMain {

    static Comparator<Computer> byCoreComparor = (o1, o2) -> o1.getCores() - o2.getCores();



    static Comparator<Computer> byNameCompartor = new Comparator<Computer>() {
        @Override
        public int compare(Computer o1, Computer o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };



    public static void main(String[] args) {
        Computer intel = new Computer("Intel", 4);
        Computer amd = new Computer("AMD", 2);
        Computer raspery = new Computer("rapberu", 1);

        ArrayList<Computer> objects = new ArrayList<>();
        objects.add(intel);
        objects.add(amd);
        objects.add(raspery);
        //posortować komputery po liczbie rdzeni używająć interfejsu comparable, a następnie lambdy
        Comparator<Computer> compoundComparator = byCoreComparor.thenComparing(byNameCompartor);
        Collections.sort(objects, compoundComparator);

        int compare = byCoreComparor.compare(intel, amd);

        System.out.print(objects);
    }
}
