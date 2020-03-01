package com.sda.exercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsExercise {


    public static void main(String[] args) {
        Map<String, Integer> peopleToCarsCount = new HashMap<>();


        peopleToCarsCount.put("Janusz", 3);
        peopleToCarsCount.put("Danuta", 2);
        peopleToCarsCount.put("Mirek", 1);
        peopleToCarsCount.put("Jarek", 0);

        //aktualizacja wartości
        peopleToCarsCount.put("Janusz", 0);

        System.out.println(peopleToCarsCount.toString());

        Integer januszCarCount = peopleToCarsCount.get("Janusz");

        boolean janusz = peopleToCarsCount.containsKey("Janusz");
        boolean isanybodyWithoutCars = peopleToCarsCount.containsValue(0);

        Set<String> strings = peopleToCarsCount.keySet();
        Collection<Integer> values = peopleToCarsCount.values();


        Set<Map.Entry<String, Integer>> entries = peopleToCarsCount.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }



    }
}
