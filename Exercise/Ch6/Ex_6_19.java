package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_19 {



    public static void change_6_19(String str) {
        str+="456";

    }



    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change_6_19(str);
        System.out.println("After change:"+str);
    }

}