package me.Gyojun.practice.practice_1;

import java.util.Arrays;

public class String클래스메서드 {

    public static void main(String[] args) {

        //1. String(char[] v) : 주어진 char배열v를 string인스턴스로 반환

/*        char[] ch = {'a','b','c'};
        String str = new String(ch); // abc
        System.out.println(str);*/


        //1-2. str.toCharArray() : 문자열(str)을 char 배열로 변환
/*
        String str = "abc";
        char[] arr = str.toCharArray(); // [ a, b, c ]
        System.out.println(Arrays.toString(arr));
*/

        //2. str.charAt(int idx) : 지정된 위치 (idx)에 있는 문자 반환
/*
        String str = "abc";
        char ch = str.charAt(2); // c
        System.out.println(ch);
*/

        //3. str.contains(charsequence  S) : 문자열(s)가 str에 포함되어 있는지 true/false로 반환(대소문자 구분)
/*
        String str="abc";
        boolean isContainsB=str.contains("b"); // true
        System.out.println(isContainsB);
        */

        //4. str.equals(object obj) : 매개변수(obj)가 str과 문자열이 같은지 비교하여 true/false 반환

/*
        String str = "abc";
        str.equals("ab"); // false
        str.equals("abc"); // true
        System.out.println(str.equals("ab"));
        System.out.println(str.equals("abc"));
*/


        //5. str.length() : 문자열의 길이 int형으로 반환  (인덱스x 배열아니기때문)

        /*
        String str = "abc";
        int len = str.length(); // 3
        System.out.println(len);
        */

        //6. str.split(String regex) : 분리자(regex)를 기준으로 잘라 String 배열을 반환
/*
        String str = "a-b-c-d-ef";
        String[] strArr = str.split("-"); // ["a","b","c","d","ef"]
        System.out.println(Arrays.toString(strArr));
*/
        //7. str.toLowerCase() : 문자열(str)의 모든 문자열을 대문자로 변환
        //7-1. str.toUpperCase() : 문자열(str)의 모든 문자열을 소문자로 변환
/*
        String str = "abc";
        String up = str.toUpperCase(); // "ABC"
        String low = up.toLowerCase(); // "abc
        System.out.println(low);
*/


        //8. String.valueOf(Boolean,Integer,...) :매개변수의 값을 문자열로 변환(참조변수: toString()호출)

        String v = String.valueOf(1); // 1

        //9. str.subString(int startIdx, int endIdx) : 시작~끝까지 문자열을 잘라서 반환 (끝위치 포함x)

        String str = "12345678";
        String sb = str.substring(2,5); // "34"

        //10. str.trim() : 문자열 양 끝쪽의 공백 제거

        String s = "  a  b  c   ";
        String tr = s.trim();  // "a  b  c"
        System.out.println(tr);
        System.out.println(s);



    }
}
