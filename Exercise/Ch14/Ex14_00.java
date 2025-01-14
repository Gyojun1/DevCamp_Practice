package me.Gyojun.practice.Exercise.Ch14;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_00 {
    public static void main(String[] args) {

        IntStream intStream = new Random().ints(5,10);
        intStream
//                .limit(10)
                .forEach(System.out::println);


    }
}
