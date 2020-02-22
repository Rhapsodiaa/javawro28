package com.sda.generics;

public class BoxDemo {

    public static void main(String[] args) {
        SimpleBox simpleBox = new SimpleBox(10);
        Integer objectInside = (Integer) simpleBox.getObjectInside();

        GenericBox<Integer> genericBox = new GenericBox<>(10);
        Integer objectInsideBox = genericBox.getObjectInsideBox();


        System.out.println(isFirstGrater(10, 20));

    }


    private static <T extends Number> boolean isFirstGrater(T first, T second) {
        return first.longValue() > second.longValue();
    }
}
