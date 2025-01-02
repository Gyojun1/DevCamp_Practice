package me.Gyojun.practice.practice_1;

import java.util.Arrays;
import java.util.Scanner;

public class 야구게임4 {
    public static void main(String[] args) {

        // 1. 정답을 랜덤값으로 정한다.  1~9 랜덤 중복x
        // 2. 입력값을 받는다  Scanner 로 받아서 값 넣는건 마지막에
        // 3. 비교한다.
        // 4. 출력한다.

        //정답값을 랜덤으로 출력
        int [] rightAnswer = new int[3];
        int [] guessNumber = new int[3];

        int strike=0;
        int ball=0;
        int cnt=0;

        Scanner scanner = new Scanner(System.in);


        // 중복값도 제거해야함 어떻게 제거할래? 카운트로 중복체크를 한다?

        for(int i=0; i<rightAnswer.length; i++){
            rightAnswer[i] = (int)(Math.random()*9)+1;
            for(int j=0; j<i; j++){
                if (rightAnswer[i]==rightAnswer[j]) {
                    i--; // 중복시 제거하기
                }
            }
        }


        while(strike<3) { // 10번안에 맞추기
            // 입력값 정수 3자리 받기

            strike = 0;
            ball = 0;

//
            System.out.println("1~9까지 숫자 중 중복되지않은 3자리 숫자를 입력해주세요.");
            int number = scanner.nextInt();

            String strNumber = number + "";

            String No1 = strNumber.substring(0, 1);
            String No2 = strNumber.substring(1, 2);
            String No3 = strNumber.substring(2, 3);

            guessNumber[0] = Integer.parseInt(No1);
            guessNumber[1] = Integer.parseInt(No2);
            guessNumber[2] = Integer.parseInt(No3);
//


            // 자 여기에서 규칙을 찾아 봅시다.


            for (int i = 0; i < rightAnswer.length; i++) {
                for (int j = 0; j < guessNumber.length; j++) {
                    if (rightAnswer[i] == guessNumber[j]) {
                        if (i == j) {
                            strike++;
                        } else
                            ball++;
                    }

                }

            }

            // 결과 출력
            System.out.printf("%dS %dB\n", strike, ball);

        }
        System.out.println("정답입니다!");
        scanner.close(); // 반복문 끝난 후 한 번만 close
    }
}