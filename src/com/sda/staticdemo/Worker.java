package com.sda.staticdemo;

public class Worker extends Person {

    @Override
    void eat() {
        System.out.println("Worker non static eat");
    }

    static void live(){
        System.out.println("Worker static live");
    }
}
