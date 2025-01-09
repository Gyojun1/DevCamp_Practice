package me.Gyojun.practice.Exercise.Ch5;

public class Ex_5_7 {

    public static void main(String[] args) {

        if(args.length !=1){
            System.out.println("USAGE: java Exercise5_7 3120");
            System.exit(0);

        }

        int money = Integer.parseInt(args[0]);

        System.out.println("money="+money);

        int[] coinUnit = {500,100,50,10}; // 동전의 단위
        int[] coin = {5,5,5,5}; //단위별 동전의 개수

        


    }
}
