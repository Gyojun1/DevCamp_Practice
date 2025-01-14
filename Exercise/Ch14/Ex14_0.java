package me.Gyojun.practice.Exercise.Ch14;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

public class Ex14_0 {
    public static void main(String[] args) {



        Stream<String> strSteam = Stream.of(new String[]{"a","b","c","d"});



        strSteam.forEach(System.out::println); // foreach로 최종연산. 소모됨.

        int [] intArr={1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(System.out::println);

        Integer [] intArr2={1,2,3,4,5};
        Stream<Integer> intStream2 = Arrays.stream(intArr2);
//        intStream2.forEach(System.out::println);
        System.out.println("count="+intStream2.count());

    }
}
