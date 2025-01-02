package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_20 {


     static int[] shuffle(int[] x){
        int tmp;
        int r;


        //숫자 섞기
        for (int i=0; i< 20; i++){
            r = (int)(Math.random()*9); //0~9 숫자 랜덤하게
            tmp = x[0];
            x[0] = x[r];
            x[r] = tmp;

        }
        return x;

    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
