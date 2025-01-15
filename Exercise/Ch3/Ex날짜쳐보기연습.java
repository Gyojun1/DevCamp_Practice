package me.Gyojun.practice.Exercise.Ch3;

import java.util.Calendar;


class Person{
    long id;




}







public class Ex날짜쳐보기연습 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        int month = cal.get(Calendar.MONTH)+1; // Month는 0부터이기 때문에 +1 해줘야 월이 나옴

        System.out.println(month);


        }
    }

