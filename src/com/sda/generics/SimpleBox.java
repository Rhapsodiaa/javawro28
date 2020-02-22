package com.sda.generics;

public class SimpleBox {

    private Object objectInside;

    public SimpleBox(Object objectInside) {
        this.objectInside = objectInside;
    }

    public Object getObjectInside() {
        return objectInside;
    }
}
