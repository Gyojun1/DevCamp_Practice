package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;

        int result=0;  // 변수 number를 거꾸로 변환해서 담을 변수


        while(tmp != 0){
            //
            //가장 중요한 연산 tmp%10과 tmp/10 이 두가지가 핵심이다.
            
            
            // result=result + tmp%10;
            // result=result*10;
            // tmp = tmp/10;  
            //순서도 중요함. result=result*10이 먼저와야 마지막이 0으로 안끝날 수 있음. 처음 *10은 값이 0이 나오니까 가장 먼저 순서를 옮겨야함

            result=result*10;
            result+=tmp%10;
            tmp = tmp/10;

        }







        if(number == result)
            System.out.println(number+"는 회문수 입니다.");
        else
            System.out.println(number+"는 회문수가 아닙니다.");



    }
}
