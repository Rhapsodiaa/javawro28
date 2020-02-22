package com.sda.enumdemo;

public enum Day {
    MONDAY("Jest źle"),
    TUESDAY("Jest źle"),
    WEDNESDAY("Jest źle"),
    THURSDAY("Jest ok"),
    FRIDAY("Jest lepiej"),
    SATURDAY("Jest dobrze"),
    SUNDAY("Jest źle");


    private String myOpinionAboutThisDay;

    Day(String myOpinionAboutThisDay) {
        this.myOpinionAboutThisDay = myOpinionAboutThisDay;
    }

    public void saySomethingAboutThisDay(){
        System.out.println(this.myOpinionAboutThisDay);
    }
}
