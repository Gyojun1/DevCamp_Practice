package me.Gyojun.practice.Exercise.Ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex_14_4_1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
            list.add(i);

        // list의 모든 요소를 출력
        list.forEach( i->System.out.print(i+","));
        System.out.println();

        //list에서 2 또는 3의 배수를 제거한다.
        list.removeIf(x->x%3==0 || x%2==0);
        System.out.println(list);           // Arrays.toString 아닌데 왜 배열값이 바로 나올까? ArrayList타입은 오버라이딩이 되어있나보다?!

        // list 각 요소에 10을 곱한다
        list.replaceAll(i->i*10);
        System.out.println(list);



        Map<String, String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");


        // map의 모든 요소를 { k , v } 의 형식으로 출력한다.
        map.forEach((k,v)-> System.out.print("{ "+k+", "+v+" }, "));













    }
}
