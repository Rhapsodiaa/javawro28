package com.sda.car;

import java.util.Comparator;

public class ByLightsComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getLights().getType().compareTo(o2.getLights().getType());
    }
}
