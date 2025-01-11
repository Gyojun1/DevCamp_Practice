package me.Gyojun.practice.Exercise.Ch7;


class Outer{
    class Inner{
        int iv=100;
    }
}


public class Ex_7_25 {

    public static void main(String[] args) {

        Outer x = new Outer();

        Outer.Inner ii = x.new Inner();

        System.out.println(ii.iv);




    }
}
