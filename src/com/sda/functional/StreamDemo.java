package com.sda.functional;

import com.sda.carexecrcises.Car;
import com.sda.carexecrcises.FuelType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> words = List.of("Ala", "ma", "kota");

        String[] anotherWords = {"a", "kot", "ma", "Alę"};

        Stream<String> stream = words.stream();

        Stream<String> stream1 = Arrays.stream(anotherWords);


        Function<String, Integer> countLetters = new Function<String, Integer>() {
            @Override
            public Integer apply(String phrase) {
                return phrase.length();
            }
        };

        List<Integer> resultList = stream
                .map(countLetters)
                .map(wordLength -> wordLength * 10)
                .filter(wordLength -> wordLength > 30)
                .collect(Collectors.toList());

        Car car1 = new Car("Honda", 100, FuelType.GASILNA);
        Car car2 = new Car("Skoad", 100, FuelType.ELECTRO);
        Car car3 = new Car("Sear", 100, FuelType.ELECTRO);

        Stream<Car> carStream = Stream.of(car1, car2, car3);


        OptionalDouble average = carStream
                .filter(car -> car.getEngine().getFuelType() == FuelType.ELECTRO)
                .map(car -> car.getEngine())
                .mapToDouble(engine -> engine.getVolume())
                .average();

        if(average.isEmpty()){
            System.out.println("Nie było żadnych samochodów");
        }else {
            double asDouble = average.getAsDouble();
            System.out.println(asDouble);
        }


    }
}
