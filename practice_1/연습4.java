package me.Gyojun.practice.practice_1;

import java.util.Arrays;

public class 연습4 {

    public static void main(String[] args) {

        int[][] score = {
                { 100, 100, 100 },
                { 20, 20, 20 },
                { 30, 30, 20 },
                { 40, 20, 20 }
        };

        System.out.println(Arrays.deepToString(score));
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

                sum = sum + score[i][j];

            }

        }

    }

}