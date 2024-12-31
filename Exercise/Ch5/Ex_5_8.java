package me.Gyojun.practice.Exercise.Ch5;

public class Ex_5_8 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {
            counter[answer[i] - 1] += 1;

        }

        
        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);
            for(int j=0; j<counter[i]; j++){ //이중 for문에 범위를 counter[i]라는 신의 한수를 써서 굉장히 간결하게 짰음
                System.out.print("*");
            }
            System.out.println();

        }

    }


}


