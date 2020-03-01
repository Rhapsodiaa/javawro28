package com.sda.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComputerMain {

    public static void main(String[] args) {
        Computer intel = new Computer("Intel", 4);
        Computer amd = new Computer("AMD", 2);
        Computer raspery = new Computer("rapberu", 1);

        ArrayList<Computer> objects = new ArrayList<>();
        objects.add(intel);
        objects.add(amd);
        objects.add(raspery);

        Comparator<Computer> byCoreComputerComparator = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return 0;
            }
        };

        String s = byCoreComputerComparator.getClass().toString();

        System.out.println(s);

        Collections.sort(objects, byCoreComputerComparator);

        System.out.print(objects);


    }
}
