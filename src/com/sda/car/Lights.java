package com.sda.car;

public class Lights {

    private String type;

    private int state = 0; //0 - turn off, 1 turn on

    public Lights(String type) {
        this.type = type;
    }

    public void lightItUp(){
        this.state = 1;
    }

    public String getType() {
        return type;
    }
}
