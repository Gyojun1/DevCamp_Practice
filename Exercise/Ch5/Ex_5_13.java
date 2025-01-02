package me.Gyojun.practice.Exercise.Ch5;

import java.util.Scanner;

public class Ex_5_13 {

    public static void main(String[] args) {
        String[] words = {"television","computer","mouse","phone"};



        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<words.length; i++){
            char[] question = words[i].toCharArray();

            for(int j=0; j<20; j++) {
                int k = (int)(Math.random()*question.length);
                char tmp = question[0];
                question[0] = question[k];
                question[k] = tmp;
            }




            System.out.printf("Q%d. %s의 정답을 입력하세요.>",i+1, new String(question));

            String answer = scanner.nextLine();

            //trim()으로 answer 좌우 공백 제거 후 equals로 word[i]와 비교
            if(words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");

        }


    }

}
