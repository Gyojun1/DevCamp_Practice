package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_6 {
    public static void main(String[] args) {

        // 랜덤 주사위 두개 만들기
        // 두개의 합이 6일 때만 출력

        int a;
        int b;


        for(int i=0; i<100; i++){
            a = (int)(Math.random()*6)+1;
            b = (int)(Math.random()*6)+1;

            if (a+b==6){
                System.out.printf("[%d,%d]  ",a,b);

            }

        }



    }
}
