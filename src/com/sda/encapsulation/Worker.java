package com.sda.encapsulation;

public class Worker {

    private String name;
    private int workExperienceInYears;
    private int negativeOpininCount;
    private String[] negativeOpinion;
    private int supervisorMark;

    public Worker() {
        this.negativeOpininCount = 0;
        this.negativeOpinion = new String[10];
        this.workExperienceInYears = 0;
        this.supervisorMark = 0;
    }

    public void addNegativeOpinion(String opinion){
        if(workExperienceInYears < 2){
            return;
        }
        if(negativeOpininCount == 9){
            return;
        }

        negativeOpinion[negativeOpininCount] = opinion;
        negativeOpininCount++;
    }

    public void setName(String name) {
        this.name = name;
    }
}
