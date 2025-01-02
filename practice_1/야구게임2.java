package me.Gyojun.practice.practice_1;

import java.util.*;

public class 야구게임2 {
    public static void main(String[] args) {

        // 중복되지 않은 3개의 숫자를 1~9 랜덤하게 출력해야함

        int[] num = new int[3];
        int[] num2 = new int[3];

        Scanner scanner = new Scanner(System.in);
        // 중복을 하지않으려면 for로 뽑은 숫자를 한번 전체 돌려서 같은 값이 1개이면 넘어가기
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 9) + 1;

            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--; // 중복될 시 다시 처리
                    break; // 참일 때 실행됨
                }
            }
        }

        for (int i = 0; i < num2.length; i++) {
            num2[i] = (int) (Math.random() * 9) + 1;
            for (int j = 0; j < i; j++) {
                if (num2[i] == num2[j]) {
                    i--; // 중복될 시 다시 처리
                    break; // 참일 때 실행됨
                }
            }
        }

        int strike = 0;
        int ball = 0;

        while (strike < 3) {
            strike = 0; // 초기화
            ball = 0;
            System.out.println("1~9까지 중복되지않게 숫자를 입력해주세요");
            String input = scanner.nextLine();

            String No1 = input.substring(0, 1);
            String No2 = input.substring(1, 2);
            String No3 = input.substring(2, 3);

            // 입력값 문자열 --> 정수값으로
            int a = Integer.parseInt(No1);
            int b = Integer.parseInt(No2);
            int c = Integer.parseInt(No3);

            int[] num3 = { a, b, c };

            // 각각 하나씩 비교를 해서 하나가 맞으면 스트라이크가 1씩 증가

            // 두개 배열의 교집합을 구해서 스트라이크 갯수를 빼면 Ball

            for (int i = 0; i < num.length; i++) { // 스트라이크 값 구하기
                // System.out.println();
                for (int j = 0; j < num.length; j++) {
                    // System.out.printf("[%d,%d]", i, j);
                    if (i == j) {
                        if (num[i] == num3[j]) {
                            strike++;
                        }
                    }
                }
            }

            for (int i = 0; i < num.length; i++) { // ball 값 구하기
                // System.out.println();
                for (int j = 0; j < num.length; j++) {
                    // ㄴ System.out.printf("[%d,%d]", i, j);

                    if (num[i] == num3[j]) {
                        if (i != j) {
                            ball++;
                        }
                    }

                }
            }

            System.out.println(strike + "S" + ball + "B");
        }

        System.out.println("축하합니다. 맞추셨습니다!");

        scanner.close();
    }

}
