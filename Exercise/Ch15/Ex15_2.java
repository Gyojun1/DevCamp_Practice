package me.Gyojun.practice.Exercise.Ch15;

import java.io.*;
import java.util.Arrays;

public class Ex15_2 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};    // input 스트림 배열
		byte[] outSrc = null;					// output 스트림 배열
		byte[] temp = new byte[10];				// inSrc 배열을 건드리지 않고 출력할 부분 담을 것

		ByteArrayInputStream  input  = new ByteArrayInputStream(inSrc);   // ByteArrayInputStream 클래스 타입의 변수
		ByteArrayOutputStream output = new ByteArrayOutputStream();	// ByteArrayOutputStream 클래스 타입의 변수

//		input  = new ByteArrayInputStream(inSrc);	// 왜 하나로 안합쳤을까? 풀어서 설명하려고 그런듯
//		output = new ByteArrayOutputStream();

		input.read(temp,0,temp.length); // 읽어 온 데이터를 배열 temp에 담는다
		output.write(temp,5, 5);        // temp[5]부터 5개의 데이터를 write한다.

		outSrc = output.toByteArray();

		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("temp          :" + Arrays.toString(temp));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}