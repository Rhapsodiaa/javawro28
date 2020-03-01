package com.sda.exercises;

import java.util.Comparator;

public class ByCoreComputerComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        return o1.getCores() - o2.getCores();
    }
}
