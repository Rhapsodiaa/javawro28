package com.sda.threads.balance;

public class Balance {

    private int commonValue = 0;

    public void increment(){
//        synchronized (this){
            this.commonValue ++;
//        }
    }

    public void decrement(){
//        synchronized (this){
            this.commonValue --;
//        }
    }

    public void showValue(){
        System.out.println("commonValue:" + commonValue );
    }
}
