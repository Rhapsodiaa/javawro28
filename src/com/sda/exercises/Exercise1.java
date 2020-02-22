package com.sda.exercises;

public class Exercise1 {



    private static Integer findMax(int[] arr){




        if(arr.length == 0){
            return null;
        }

        int temporaryMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int actualArrValue = arr[i];
            if(actualArrValue > temporaryMax){
                temporaryMax = actualArrValue;
            }
        }

        return temporaryMax;
    }

    private static String findShortest(String[] words){

        if(words.length == 0) {
            return null;
        }

        String shortest = words[0];

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() < shortest.length()){
                shortest = words[i];
            }
        }

        return shortest;
    }

    public static void main(String[] args) {

        int[] exampleData = {1,4,6,13,6};

        int max = findMax(exampleData);

        System.out.println();

    }



}
