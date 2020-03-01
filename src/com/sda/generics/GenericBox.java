package com.sda.generics;

public class GenericBox<OBJ extends Number> {
    OBJ objectInsideBox;

    public GenericBox(OBJ objectInsideBox) {
        this.objectInsideBox = objectInsideBox;
    }

    public OBJ getObjectInsideBox() {
        return objectInsideBox;
    }

}
