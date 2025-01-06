package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        //반복문과 charAt(int i)를 이용해서 문자열의 문자를
        // 하나씩 읽어서 검사한다.
        for (int i=0; i < value.length(); i++){
            if(!('0'<= ch &&  ch<='9')){
                isNumber = false;
                break;

            }
        }


        try{
            Integer.parseInt(value);
            System.out.println("숫자임 ㅇㅇ");
        }catch (Exception e){
            System.out.println("아님 ㅇㅇ");
        }


        if(isNumber){
            System.out.println(value+"는 숫자입니다.");
        } else {
            System.out.println((value+"는 숫자가 아닙니다."));
        }


        /*
        ch = value.charAt(i); //value의 값을 하나씩 char변환후 ch저장
        if (!('0'<=ch && ch<='9')){ //ch의 값이 숫자인지 판단
            isNumber = false;
            break;
        }

         */


    }
}
