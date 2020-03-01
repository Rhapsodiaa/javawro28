package com.sda.threads.creatingthreads;

public class ThreadsDemo {


    public static void main(String[] args) throws InterruptedException {

        HappyThread happyThread = new HappyThread();

        BraveRunnable braveRunnable = new BraveRunnable();

        Thread braveRunnableThread = new Thread(braveRunnable);

        happyThread.start();
        braveRunnableThread.start();

        while (true){
            System.out.println("Wyświetlam z main");
            Thread.sleep(1000);
        }

    }


}
