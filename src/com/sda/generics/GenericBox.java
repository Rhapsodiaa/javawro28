package com.sda.generics;

public class GenericBox<T extends Integer> {
    T objectInsideBox;

    public GenericBox(T objectInsideBox) {
        this.objectInsideBox = objectInsideBox;
    }

    public T getObjectInsideBox() {
        return objectInsideBox;
    }

}
