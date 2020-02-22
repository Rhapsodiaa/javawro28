package com.sda.car;

public class Engine {
    private double volumeInCm3;

    private double engieneSpidInRps;

    public Engine(double volumeInCm3) {
        this.volumeInCm3 = volumeInCm3;
        this.engieneSpidInRps = 0;
    }

    public void faster(double actualSpeedInRps){
        this.engieneSpidInRps = actualSpeedInRps;
        System.out.printf("RPS: %d", engieneSpidInRps);
    }

    public void turnOff(){
        this.engieneSpidInRps = 0;
    }

    public double getVolumeInCm3() {
        return volumeInCm3;
    }
}
