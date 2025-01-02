package me.Gyojun.practice.practice_1;

public class 연습3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i >= j) {
                    System.out.printf("[%d,%d]", i, j);
                }

            }
            System.out.println();
        }

        System.out.printf("[%5d]\n", 10);

        System.out.printf("[%-5d]\n", 10);

    }
}