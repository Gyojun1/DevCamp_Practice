package me.Gyojun.practice.Exercise.Ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex_11_1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();  // 교집합
        ArrayList cha = new ArrayList();  // 차집합
        ArrayList hap = new ArrayList();  // 합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);



        //먼저 비어있는 ArrayList에 list1을 먼저 초기화 시킴
        kyo.addAll(list1);
        cha.addAll(list1);
        hap.addAll(list1);

        /*
        // 그리고 메서드를 이용해서 집합개념으로 두 개를 비교연산하여서 교집합 차집합 구하기
        kyo.retainAll(list2);
        cha.removeAll(list2);

        // 주의할 점 ArrayList는 중복이 혀용되기 때문에 두 번을 써서처리. HashSet은 중복이 없기 때문에 HashSet으로 한줄로 가능.(그러나 이 문제는 제한적이여서 사용x)
        hap.removeAll(list2);
        hap.addAll(list2);

        */


        HashSet kyo1 = new HashSet(list1);
        HashSet cha1 = new HashSet(list1);
        HashSet hap1 = new HashSet(list1);

        kyo1.retainAll(list2);
        cha1.removeAll(list2);
        hap1.addAll(list2);

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);
        System.out.println("kyo="+kyo1);
        System.out.println("cha="+cha1);
        System.out.println("hap="+hap1);

    }
}
