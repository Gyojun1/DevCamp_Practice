package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_11 {
    public static void main(String[] args) {

        //Fibonnaci 수열의 시작의 첫 두 숫자를 1,1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째 값

        System.out.print(num1+","+num2);

        // 변수의 값을 +로 잘 비벼서 한단계씩 올라갈 수 있도록
        // 1번포인트 - 3개의 iv를 이용해서 출력을 할 생각하기
        // 그 다음에는 +로 대입하기

        for(int i=0; i<8; i++){
            num3=num1+num2;
            num1=num2;
            num2 =num3;
            System.out.print(","+num3);

        }



    }
}
