package me.Gyojun.practice.practice_1;

public class 별짓기 {
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
                if (i >= j && i + j <= 4 || i <= j && i + j >= 4) {
                    System.out.printf("*");
                } else {
                    System.out.print(" ");
                }
            }
        }

        System.out.println();

        for (int i = 1; i < 10; i += 2) { // i가 1 3 5 7 9 총 5번인데 왜 i<10과 i+=2를 썼을까?
            for (int j = 10; j > i; j -= 2) { // 빈칸 갯수 4칸 에서 0까지 9 7 5 3 1 총 5번 이것떄문인거같은데?
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { // i의 범위 이유는 별이 두개씩 늘어나야되기떄문이였음.
                System.out.print("*"); // 별이 두개씩 늘어나야함
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        int number = 29;
        number /= 100;
        System.out.println(number);

    }
}
