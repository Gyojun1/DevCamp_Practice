package me.Gyojun.practice.Exercise.Ch3;

public class Ex_3_10 {
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = (true) ? ch+=32 : ch;

        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
