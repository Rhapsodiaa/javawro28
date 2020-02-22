package com.sda.carexecrcises;

public class RaceCar extends Car{

    boolean hasTurbo;

    public RaceCar(String brandOfNewCar) {
        super(brandOfNewCar);
        this.hasTurbo = false;
    }

    public void mountTurbo(){
        this.hasTurbo = true;
    }

    @Override
    public void carSound() {

        if(hasTurbo){
            System.out.println("ŁING");
        }else {
            System.out.println("Prr pr pr...");
        }
    }
}
