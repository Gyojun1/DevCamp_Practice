package me.Gyojun.practice.Exercise.Ch5;

public class Ex_5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total=0;
        float average=0;


        int num=0;
        for (int i=0; i<arr.length; i++){
             num += arr[i].length;

            for(int j=0; j<arr[i].length; j++){
                total+=arr[i][j];

            }
        }

        average=(float)total/num;




        System.out.println("total="+total);
        System.out.println("average="+average);



    }
}
