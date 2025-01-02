package me.Gyojun.practice.practice_1;

public class 연습 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (true) {
                    System.out.printf("[%d,%d]", i, j);
                }

            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {

            for (int j = -5; j < i; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }

        // ||합집합,&&교집합, !여집합

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i + j == 6) {
                    System.out.printf("*", i, j);
                } else {
                    System.out.printf("%c", ' ');
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i == j) {
                    System.out.printf("*", i, j);
                } else {
                    System.out.printf("%c", ' ');
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i == j || i + j == 6) {
                    System.out.printf("*", i, j);
                } else {
                    System.out.printf("%c", ' ');
                }
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 5; i > 0; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 2; i <= 3; i++) {
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = 1; i < 10; i += 2) { // i가 1 3 5 7 9 총 5번인데 왜 i<10과 i+=2를 썼을까?
            for (int j = 9; j > i; j -= 2) { // 빈칸 갯수 4칸 에서 0까지 9 7 5 3 1 총 5번 이것떄문인거같은데?
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { // i의 범위 이유는 별이 두개씩 늘어나야되기떄문이였음.
                System.out.print("*"); // 별이 두개씩 늘어나야함
            }
            System.out.println();
        }

        for (int i = 1; i < 6; i += 2) { // i가 1 3 5 7 9 총 5번인데 왜 i<10과 i+=2를 썼을까?
            for (int j = 5; j > i; j -= 2) { // 빈칸 갯수 4칸 에서 0까지 9 7 5 3 1 총 5번 이것떄문인거같은데?
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { // i의 범위 이유는 별이 두개씩 늘어나야되기떄문이였음.
                System.out.print("*"); // 별이 두개씩 늘어나야함
            }
            System.out.println();
        }

    }
}
