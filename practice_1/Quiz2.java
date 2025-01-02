package me.Gyojun.practice.practice_1;

public class Quiz2 {
    public static void main(String[] args) {
        // 배열 arr에서 int[] arr = {2,5,2,3,3,3,1,1,1,1}
        // 중복제거 해서 출력 = 1 2 3 5
        // 정렬해서 출력 = 1111223335
        // sort금지, 2중 for문 금지
        // 1~9 숫자 중이라고 가정

        int[] arr = { 2, 5, 2, 3, 3, 3, 1, 1, 1, 1 };

        int[] arrList = new int[9];

        // arr 안에 있는 숫자들을 arrList에다가 갯수 카운트하기
        for (int i = 0; i < arr.length; i++) {
            arrList[arr[i] - 1] += 1;
        }

        // 중복제거, 정렬해서 출력하기
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i] != 0) {
                System.out.print(i + 1);
            }
        }

        System.out.println();

        // 어디에서 1111223335
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i] == 0) {
                continue;
            } else {
                System.out.print(i + 1);
                arrList[i]--;
                i--;
            }

        }

    }
}
