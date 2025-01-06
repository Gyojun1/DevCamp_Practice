package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_5 {
    public static void main(String[] args) {

        int i =1;
        int j =0;

        while (i<=10){
            j=0;

            while (j<i){

                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }




    }
}
