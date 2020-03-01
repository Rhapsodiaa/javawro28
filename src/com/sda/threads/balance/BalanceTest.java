package com.sda.threads.balance;

public class BalanceTest {

    public static void main(String[] args) throws InterruptedException {

        Balance balance = new Balance();

        Runnable runnableIncrement = () -> {
            for (int i = 0; i < 10000; i++) {

                balance.increment();
            }
        };

        Runnable runnableDecrement = () -> {
            for (int i = 0; i < 10000; i++) {
                balance.decrement();
            }
        };

        Thread thread1 = new Thread(runnableIncrement);
        Thread thread2 = new Thread(runnableDecrement);

        thread1.start();
        thread2.start();

        Thread.sleep(2000);

        balance.showValue();


    }
}
