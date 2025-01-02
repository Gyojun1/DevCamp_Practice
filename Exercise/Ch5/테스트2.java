package me.Gyojun.practice.Exercise.Ch5;

import java.util.Scanner;

public class 테스트2 {
    public static void main(String[] args) {
        int num=0;

        // 정수 입력값을 받을 때까지 다시 입력하도록

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("정수를 입력하세요.");
                num = scanner.nextInt();

                break;

            } catch (Exception e) {
                System.out.println("다시 입력하세요.");
            }
        }

        scanner.close();
        System.out.println(num);







    }
}
