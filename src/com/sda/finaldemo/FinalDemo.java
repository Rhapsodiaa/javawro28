package com.sda.finaldemo;

public class FinalDemo {

    final String finalString = "This can not be changed";

    private int doSomething(final int input){
        //input = 10;// niemożna przypisać do parametruu final

        final int x = 100;
        //x=200; nie można jeszcze raz przypisać do finalnej zmiennej

        return 0;
    }

}
