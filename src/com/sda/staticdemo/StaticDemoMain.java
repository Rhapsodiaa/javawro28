package com.sda.staticdemo;

public class StaticDemoMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.eat(); // metod eat from person

        Person person2 = new Worker();
        person2.eat(); //method eat from worker

        //==================
        System.out.println("=======");

        Person person3 = new Person();
        person3.live(); //method live from person

        Person person4 = new Worker();
        person4.live();

        Worker person5 = new Worker();
        person5.live();

    }
}
