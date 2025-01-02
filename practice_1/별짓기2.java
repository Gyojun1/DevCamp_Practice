package me.Gyojun.practice.practice_1;

public class 별짓기2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.printf("[%d,%d]", i, j);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (!(i + j > 4 && i < j || i + j < 4 && i > j)) {
                    System.out.printf("[%d,%d]", i, j);
                } else {
                    System.out.print("     ");
                }
            }
        }
        System.out.println();

        for (int i = 1; i < 10; i += 2) {
            for (int j = 9; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        int qwer[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArr(qwer);

    }

    static void printArr(int[] numArr) {
        for (int i = 0; i < 10; i++)
            System.out.printf("%d", numArr[i]);

        System.out.println();

    }
}