package com.sda.nested;

public class SomeOuterClass {

    private int outerPrivateField = 10;
    public int outerPublicField = 11;

    public class SomeInnerClass{

        public void showOuterClassFields(){
            System.out.println("Mam dostęp pól klasy zewnętrznej: ");
            System.out.println(outerPrivateField);
            System.out.println(outerPublicField);
        }
    }

    public static void main(String[] args) {
        SomeOuterClass someOuterClass = new SomeOuterClass();
        SomeInnerClass someInnerClass = someOuterClass.new SomeInnerClass();

        someInnerClass.showOuterClassFields();
    }

}
