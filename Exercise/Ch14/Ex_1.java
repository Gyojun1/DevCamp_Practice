package me.Gyojun.practice.Exercise.Ch14;

public class Ex_1 {
    public static void main(String[] args) {

//        MyFunction2 f = new MyFunction2() {
//            @Override
//            public int max(int a, int b) { return a > b ? a:b ;}
//        };

        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로한다.
        MyFunction2 f = (a,b) ->  a > b ? a:b ; //람다식. 익명객체

        int value = f.max(3,5);
        System.out.println("value="+value);

    }
}



@FunctionalInterface
interface MyFunction2{
//    public abstract int max(int a, int b);
    int max(int a,  int b);
}














