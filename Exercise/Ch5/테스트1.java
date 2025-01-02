package me.Gyojun.practice.Exercise.Ch5;


import java.util.Scanner;

public class 테스트1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0; // 입력값을 저장할 변수

        while (true) {     // 오류없이 try를
            try {
                System.out.print("정수를 입력하세요: ");
                number = scanner.nextInt(); // 정수 입력
                break; // 올바른 입력 시 반복 종료
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 정수를 다시 입력하세요.");
                scanner.nextLine(); // 잘못된 입력 제거 (버퍼 비우기)
            }
        }

        System.out.println("입력한 숫자: " + number);
        scanner.close();
    }
}