package me.Gyojun.practice.Exercise.Ch7;

class Outer_{
    static class Inner{
        int iv=200;
    }
}


public class Ex_7_26 {
    public static void main(String[] args) {


        Outer_.Inner x = new Outer_.Inner();

        System.out.println(x.iv);


    }
}
