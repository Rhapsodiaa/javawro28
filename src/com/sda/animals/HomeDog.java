package com.sda.animals;

public class HomeDog extends Dog {

    int rewardCount;

    public HomeDog(String name) {
        super(name);
    }

    public void makeTrick(){
        String command = createCommand("");
        System.out.println(command);
        rewardCount++;
    }
}
