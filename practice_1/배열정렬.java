package me.Gyojun.practice.practice_1;

import java.util.Arrays;

public class 배열정렬 {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 1, 3, 3, 5, 3, 1, 2, 1 };

        int[] count = new int[10]; // 0~9까지의 숫자 등장 횟수 저장

        System.out.println(Arrays.toString(count));

        for (int num : arr) { // [0] - 0갯수 [1] - 1갯수
            count[num]++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(count));

    }
}






