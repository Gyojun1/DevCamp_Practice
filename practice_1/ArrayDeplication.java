package me.Gyojun.practice.practice_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeplication {
    public int[] arr;


    // 여기에서 this는 주소값인데 굳이 붙일 이유가있었나?
    public ArrayDeplication(String str){
        this.arr = stringToIntArray(str);
        System.out.println("입력 받은 배열: "+ Arrays.toString(this.arr));
        this.arr = deplication();
        System.out.println("중복 제거한 배열: "+ Arrays.toString(this.arr));
//        this.arr = sort();
        this.arr = sort2();
        System.out.println("정렬한 배열: "+ Arrays.toString(this.arr));
    }

    // 입력 받은 숫자(공백 기준)으로 int 배열 생성   // 메서드1 어떤 메서드인가? 입력받은배열을 스플릿으로 쪼개서 정수로 변환하여서 배열에 넣음
    public int[] stringToIntArray(String str) {
        String[] tmp = str.split(" ");
        this.arr = new int[tmp.length];

        for (int i = 0; i < tmp.length; i++) {
            this.arr[i] = Integer.parseInt(tmp[i]);
        }
        return this.arr;
    }

    // 중복 값 제거
    public int[] deplication(){
        int[] res;

        for (int idx = 0; idx < this.arr.length; idx++) {
            int tmp = this.arr[idx]; // 첫 번째 요소부터 시작 // tmp배열을 만들어서 각 배열에 값을 집어넣음.
            for (int i = 1; i < this.arr.length; i++) {
                if(tmp == this.arr[i] && idx != i){ //
                    // 같은 요소가 있는 경우 - 인덱스 기준으로 자름
                    res = new int[this.arr.length-1];
                    for (int j = 0; j < i; j++) {
                        res[j] = this.arr[j];
                    }
                    for (int j = i+1; j < this.arr.length; j++) {
                        res[j-1] = this.arr[j];
                    }
                    this.arr = res;
                }
            }
        }

        return this.arr;
    }

    // 정렬하기 - 선택 정렬
    public int[] sort(){
        for (int i = 0; i < this.arr.length; i++) {
            int minIdx = i;
            int minValue = this.arr[i];

            for (int j = i+1; j < this.arr.length; j++) {
                if(this.arr[j] < this.arr[minIdx]){
                    minIdx = j;
                    minValue = this.arr[j];
                }
            }
            // 최소값의 변경이 일어나면
            if(minIdx != i){
                int tmp = this.arr[i];
                this.arr[i] = minValue;
                this.arr[minIdx] = tmp;
            }
        }

        return this.arr;
    }

    // 계수 정렬
    public int[] sort2(){
        int max = Integer.MIN_VALUE;
        // 가장 큰 값 찾기
        for(int val : this.arr){
            if(max < val){
                max = val;
            }
        }

        int[] tmp = new int[max+1];
        for(int val : this.arr){
            tmp[val]++;
        }
//        System.out.println(Arrays.toString(tmp));

        int[] newArr = new int[this.arr.length];
        int idx = 0;
        for (int i = 1; i < tmp.length; i++) {
            if(tmp[i] != 0){
                newArr[idx++] = i;
            }
        }

        return newArr;
    }
}

class ArrayDeplicationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        ArrayDeplication arrayDeplication = new ArrayDeplication(input);



    }
}



