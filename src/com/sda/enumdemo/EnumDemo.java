package com.sda.enumdemo;

import com.sda.encapsulation.Worker;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println("Start programu");

        Day actualDay = Day.FRIDAY;

        Day monday = Day.valueOf("MONDAY");

        Day[] values = Day.values();



        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }
}
