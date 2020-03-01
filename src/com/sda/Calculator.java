package com.sda;

import com.sda.staticdemo.CanNotDivideByNegativeNumberException;

import java.io.IOException;
import java.util.Dictionary;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    ;

    public int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public int add(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public int divide(int numerator, int denumerator) throws IOException {
        if (denumerator == 0) {
            throw new IOException("Nie można dzielić przez 0");
        }
        if (denumerator < 0) {
            throw new CanNotDivideByNegativeNumberException("Nie dzilmy przez ujemne");
        }
        return numerator / denumerator;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        int divide = 0;
        try {
            divide = calculator.divide(10, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(divide);


    }
}
