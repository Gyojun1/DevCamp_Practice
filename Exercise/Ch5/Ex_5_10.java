package me.Gyojun.practice.Exercise.Ch5;

import java.util.Arrays;

public class Ex_5_10 {
    public static void main(String[] args) {

        char[] abcCode =
                {
                        '`', '~', '!'
                };

        char[] numCode = {'q', 'w', 'e', 'r'};

        String src = "abc123";
        String result = "";

//        char ch = src.charAt(0);
//        char ch1 = src.charAt(1);
//        char ch2 = src.charAt(2);
//        char ch3 = src.charAt(3);
//        char ch4 = src.charAt(4);
//        char ch5 = src.charAt(5);
//
//        result = abcCode[ch-97]+"";
//        result += (abcCode[ch1-97]+"");
//        result += (abcCode[ch2-97]+"");
//        result += (numCode[ch3-'0']+"");
//        result += (numCode[ch4-'0']+"");
//        result += (numCode[ch5-'0']+"");

        for(int i=0; i<src.length(); i++){
            char ch = src.charAt(i);        //src의 한글자씩 가져옴
            if (i<3) {
                result += (abcCode[ch - 97] + "");
            } else {
                result += (numCode[ch - '0'] + "");
            }
        }






        System.out.println("src:"+src);
        System.out.println("result:"+result);

    }

}
