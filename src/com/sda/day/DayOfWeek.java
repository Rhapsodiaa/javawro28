package com.sda.day;

public enum  DayOfWeek {
    MONDAY("Lubię, bo mogę iść do pracy"),
    TUESDAY("Już wtorek"),
    WEDNESDAY("Nic szczególnego"),
    THURSDAY("Myślę o głupotach"),
    FRIDAY("Piąteczek piątuni"),
    SATURDAY("Relax"),
    SUNDAY("Relax 2");

    private String myFeelingAboutThis;

    DayOfWeek(String myFeelingAboutThis) {
        this.myFeelingAboutThis = myFeelingAboutThis;
    }

    public void tellMeSomethingAboutThisDay(){
        System.out.println("this is " + this.name());
        System.out.println(this.myFeelingAboutThis);
    }

}
