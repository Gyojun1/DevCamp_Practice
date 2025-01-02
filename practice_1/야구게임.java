package me.Gyojun.practice.practice_1;

import java.util.Arrays;

public class 야구게임 {

    public static void main(String[] args) {

        int[] num = new int[3]; // 비교하기 위한 2개의 배열 생성
        int[] num2 = new int[3];

        // 1~9 랜덤 숫자 중복 불가

        for (int i = 0; i < num.length; ++i) {
            int random;
            boolean isDuplicate;

            do {
                random = (int) (Math.random() * 9) + 1;
                isDuplicate = false;
                // 중복 확인
                for (int j = 0; j < i; j++) {
                    if (num[j] == random) {
                        isDuplicate = true; // 중복이 있으면 true로 설정
                        break;
                    }
                }
            } while (isDuplicate); // 중복일 경우 반복

            num[i] = random; // 중복되지 않은 값 배열에 추가
        }

        for (int i = 0; i < num2.length; ++i) {
            int random;
            boolean isDuplicate;

            do {
                random = (int) (Math.random() * 9) + 1;
                isDuplicate = false;
                // 중복 확인
                for (int j = 0; j < i; j++) {
                    if (num2[j] == random) {
                        isDuplicate = true; // 중복이 있으면 true로 설정
                        break;
                    }
                }
            } while (isDuplicate); // 중복일 경우 반복

            num2[i] = random; // 중복되지 않은 값 배열에 추가
        }

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));

        int strike = 0; // 스트라이크 갯수 카운트

        for (int i = 0; i < num.length; i++) {
            if (num[i] == num2[i]) {
                strike += 1;
                break;
            }
        }

        int ball = 0; // 볼의 갯수 카운트

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num.length; j++) {

                if (num[i] == num2[j]) {
                    ball += 1;
                    break;
                }
            }
        }

        ball -= strike;
        System.out.println(strike + "S" + ball + "B");

    }

}
