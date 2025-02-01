package me.Gyojun.practice.Exercise.Ch14;

import java.util.*;
import java.util.stream.*;



public class Ex_14_05 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Stream<Integer> integerStream = list.stream(); // 컬렉션   why? 이게 컬렉션인가? list잖아. list set보고 컬렉션이라 하는거겠지?

        Stream<String> stringStream = Stream.of(new String[]{"a","b","c"}); // 배열을 스트림으로

        Stream<Integer> evenStream = Stream.iterate(0, n->n+2);  // 0,2,4,6, ...   stream에 of와 iterate 메서드 확인

        Stream<Double> randomStream = Stream.generate(Math::random); // 람다식

        IntStream intStream = new Random().ints(5);    // 난수 스트림 (크기가 5)

        // 위에서 다양한 타입들을 스트림으로 생성을해서 저장했음
        // 아래에서 스트림을 이용한 중간연산과 최종연산

        String[] strArr = {"dd", "aaa", "CC", "cc", "b"};

        Stream<String> stream1 = Stream.of(strArr);
        Stream<String> filteredStream = stream1.filter(s -> s.length() > 1) // 길이가 1 초과인 문자열만 필터링
                .peek(s-> System.out.println(s));

        List<String> result = Stream.of(strArr)
                .filter(s -> s.length() > 1)
                .peek(s -> System.out.println(s)) // 중간 연산
                .collect(Collectors.toList()); // 최종 연산

        Stream<String> stream2 = Stream.of(strArr);
        Stream<String> distinctedStream = stream2.distinct(); // 중복 제거

        Stream<String> stream3 = Stream.of(strArr);
        Stream<String> sortedStream = stream3.sorted(); // 정렬

        Stream<String> stream4 = Stream.of(strArr);
        Stream<String> limitedStream = stream4.limit(5); // 최대 5개 요소 가져오기

        Stream<String> stream5 = Stream.of(strArr);
        long total = stream5.count(); // 요소 개수 세기

        System.out.println("총 개수: " + total);
        System.out.println(result);






    }


}





















