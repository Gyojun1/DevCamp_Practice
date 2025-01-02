package me.Gyojun.practice.practice_1;

import java.util.Arrays;

public class 퀴즈2 {

    public static void main(String[] args) {
        // 배열 arr에서 int[] arr = {2,5,2,3,3,3,1,1,1,1}
        // 중복제거 해서 출력 = 1 2 3 5
        // 정렬해서 출력 = 1111223335
        // sort금지, 2중 for문 금지

        int[] arr = { 2, 5, 2, 3, 3, 3, 1, 1, 1, 1 };
        int[] arrList = new int[9];
        int[] arrList2 = new int[9];
        int[] arrList3 = new int[9];

        // 중복 제거 다른 배열 생성후 그안에 arr을 하나씩 넣고 중복이 나오면 제거 혹은 중복이면 다음으로
        // 1~9까지 하나씩 다 카운팅 후 순서대로 출력

        for (int i = 0; i < arr.length; i++) {
            arrList[arr[i] - 1]++; // -1 해주는 이유는 배열의 인덱스 범위가 0~8 까지이기 때문이다
            arrList2[arr[i] - 1]++; // 배열[n]에 +1 한다는 의미는 배열[n]에 숫자 1을 카운트하는것
        }
        System.out.println(Arrays.toString(arrList));

        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i] != 0) {
                arrList3[i] = i + 1;
                System.out.print(i + 1);

            }

        }
        System.out.println();
        System.out.println(Arrays.toString(arrList3));

        // arrList[0] = 1 갯수 그렇다면 배열인덱스의 겟수만큼 숫자 출력을 하도록
        for (int i = 0; i < arrList2.length; i++) {
            if (arrList2[i] == 0) {
                continue;
            } else {
                System.out.print(i + 1);
                arrList2[i]--;
                i--;

            }
        }
    }
}