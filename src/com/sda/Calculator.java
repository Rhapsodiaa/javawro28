package com.sda;

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

    public int divide(int numerator, int denumerator) throws IllegalArgumentException {
        if (denumerator == 0) {
            throw new IllegalArgumentException("Nie można dzielić przez 0");
        }
        return numerator / denumerator;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        calculator.add(1, 2, 3);
        calculator.add("1", "2");


        try {
            //ten blok zawsze, jeżli w tym bloku będzie wyjątek, to sterowanie zostanie
            //przekazane do bloku catch
        } catch (IllegalArgumentException e) {
            //to jest blok, który będzie się wykonywał jak w bloku try poleci wyjątek
        } finally {
            //ten blok wykona się zawsze, nawet, jeżeli w try było użyte słowo kluczowe return
        }

        try {
            calculator.divide(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Nie możesz dzielić przez 0");
        }


    }
}
