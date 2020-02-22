package com.sda;

public class StackOfMethodsCall {


    public static void main(String[] args) {
        System.out.println("Wchodzę do metody 1");
        method1();
        System.out.println("Wychodzę z metody 1");
    }

    public static void method1(){
        System.out.println("Wchodzę do metody 2");
        method2();
        System.out.println("Wychodzę z metody 2");
    }

    public static void method2(){
        System.out.println("Wchodzę do metody 3");
        method3();
        System.out.println("Wychodzę z metody 3");
    }

    public static void method3(){

    }
}
