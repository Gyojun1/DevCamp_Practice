package me.Gyojun.practice.practice_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열퀴즈3 {
    public static void main(String[] args) {
        // 배열 arr에서 int[] arr = {2,5,2,3,3,3,1,1,1,1}
        // 중복제거 해서 출력 = 1 2 3 5
        // 정렬해서 출력 = 1111223335
        // sort금지, 2중 for문 금지
        // 1~5 숫자 중이라고 가정


        //배열 생성
        int[] arr = {2,5,2,3,3,3,1,1,1,1};

        //cnt할 배열 생성
        int[] arrList = new int[5];

        // 배열인덱스는 0부터 5니까 배열 위치값에 -1
        for(int i=0; i<arr.length; i++) {
            arrList[arr[i]-1] += 1;
        }

        System.out.println(Arrays.toString(arrList));


        for(int i=0; i<arrList.length; i++) {
            if (arrList[i] != 0) {
                System.out.print(i + 1);
            }
        }
        System.out.println();

        for(int i=0; i<arrList.length; i++) {
            if (arrList[i] != 0) {
                System.out.print(i + 1);
                arrList[i]-=1;
                i--;
            }

        }




    }

}
