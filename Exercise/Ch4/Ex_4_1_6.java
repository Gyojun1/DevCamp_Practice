package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_1_6 {

    public static void main(String[] args) {


        for(int year = 1990; year<2030; year++) {
            if (year / 400 > 0 && year % 400 == 0 || year / 4 > 0 && year % 4 == 0 && year % 100 != 0) {
                System.out.println(year);
            }
        }

    }
}
