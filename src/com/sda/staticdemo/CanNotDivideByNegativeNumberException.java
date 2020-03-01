package com.sda.staticdemo;

public class CanNotDivideByNegativeNumberException extends IllegalArgumentException {

    public CanNotDivideByNegativeNumberException(String s) {
        super(s);
    }
}
