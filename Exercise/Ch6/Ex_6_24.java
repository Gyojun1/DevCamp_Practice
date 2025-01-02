package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_24 {

    static int abs(int a){
        return Math.abs(a);
    }


    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));



    }
}
