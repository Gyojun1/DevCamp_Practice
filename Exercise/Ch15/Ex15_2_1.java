package me.Gyojun.practice.Exercise.Ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_2_1 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};    // input 스트림 배열
        byte[] outSrc = null;					// output 스트림 배열
        byte[] tmp = new byte[10];				// inSrc 배열을 건드리지 않고 출력할 부분 담을 것

        ByteArrayInputStream input  = new ByteArrayInputStream(inSrc);   // ByteArrayInputStream 클래스 타입의 변수
        ByteArrayOutputStream output = new ByteArrayOutputStream();	// ByteArrayOutputStream 클래스 타입의 변수

//		input  = new ByteArrayInputStream(inSrc);	// 왜 하나로 안합쳤을까? 풀어서 설명하려고 그런듯
//		output = new ByteArrayOutputStream();

        input.read(tmp,0,tmp.length);    // tmp에 배열 0번째부터 7미만까지 읽어옴. 즉, 배열을 복사한다? arraycopy랑 다를게 없네
//        System.arraycopy(inSrc,0,tmp,0,7);
        output.write(tmp,3,7);  // read한 배열의 길이보다 크면 안됨




        outSrc = output.toByteArray();      // output에 write한 내용을 배열에 넣는 메서드?

        System.out.println("Input Source  :" + Arrays.toString(inSrc));
        System.out.println("tmp          :" + Arrays.toString(tmp));
        System.out.println("Output Source :" + Arrays.toString(outSrc));
    }
}
