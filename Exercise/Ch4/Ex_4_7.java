package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_7 {
    public static void main(String[] args) {


        // 1번 포인트 - 실수값이 포함된 값이기때문에 정수값을 얻고싶으면 (int)를 붙여서 형변환 해야함.
        // 2번 포인트 - Math.random()은 범위가 0부터 시작이다.

        int value = (int)(Math.random()*6)+1;

        System.out.println("value:"+value);

        for(int i=0; i<20; i++){
            int a = (int)(Math.random()*6)+1;
            System.out.println(a);
        }

    }
}
