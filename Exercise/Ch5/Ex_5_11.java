package me.Gyojun.practice.Exercise.Ch5;

public class Ex_5_11 {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };

        //6x4 배열 생성
        int[][] result = new int[score.length+1][score[0].length+1];

        for(int i=0; i<score.length; i++){

            for(int j=0; j<score[i].length; j++){
                result[i][0]=score[i][j];
                result[i][1]=score[i][j];
                result[i][2]=score[i][j];

                result[i][3]+= score[i][j];
                result[5][3] += score[i][j];

            }
            result[5][0] += score[i][0];
            result[5][1] += score[i][0];
            result[5][2] += score[i][0];


        }


        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }




    }
}
