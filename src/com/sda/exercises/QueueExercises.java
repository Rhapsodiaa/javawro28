package com.sda.exercises;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercises {
    public static void main(String[] args) {

        Queue<Integer> integersQueue = new LinkedList<>();


        integersQueue.add(1);
        integersQueue.add(2);
        integersQueue.add(3);


        while (!integersQueue.isEmpty()){
            Integer poll = integersQueue.poll();
            System.out.printf(poll.toString());
        }



    }
}
