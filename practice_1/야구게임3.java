package me.Gyojun.practice.practice_1;

import java.util.*;

public class 야구게임3 {
    public static void main(String[] args) {

        // 중복되지 않은 3개의 숫자를 1~9 랜덤하게 출력해야함

        int[] num = new int[9];

        for (int i = 0; i < num.length; i++) {
            int random;
            boolean isDuplicate;

            do {
                random = (int) (Math.random() * 9) + 1;
                isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (num[j] == random) {
                        System.out.println(random);
                        isDuplicate = true;
                        break;
                    }

                }
            } while (isDuplicate);

            num[i] = random;
            System.out.println(Arrays.toString(num));
        }

    }

}
