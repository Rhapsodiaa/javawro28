package com.sda.nested.staticinner;

public class AnotherOuterClass {

    public int outerClassInt = 100;

    static class SomeInnerClass{
        void showOuterClassFields(){
            //nie można się dostać do outerClassInt
        }
    }
}
