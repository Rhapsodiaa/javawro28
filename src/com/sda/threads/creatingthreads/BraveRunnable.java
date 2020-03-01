package com.sda.threads.creatingthreads;

public class BraveRunnable implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("Wyświtlam z runnable");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
