package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_22 {


    static boolean isNumber(String str){
        if (str == null || str.isEmpty()){  //null이거나 빈문자열일 때 false  그러면 숫자열과 문자열 구분은?
            return false;
        } else
            return true;
    }


    public static void main(String[] args) {
        String str ="123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

//        Integer.parseInt(str);
        System.out.println(str);

        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));





    }
}
