package com.sda.collections;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        System.out.println(integers);

        integers.add(10);
        System.out.println(integers);

        List<Integer> igratherThan10 = List.of(101, 102);
        integers.addAll(igratherThan10);
        System.out.println(integers);

        integers.removeIf(integer -> integer == 101);
        System.out.println(integers);



    }

}
