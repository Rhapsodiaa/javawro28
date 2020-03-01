package com.sda.threads.creatingthreads;

public class HappyThread extends Thread {

    @Override
    public void run() {
        while (true){
            System.out.println("I am happy thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
