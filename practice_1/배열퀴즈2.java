package me.Gyojun.practice.practice_1;

import java.util.Arrays;

public class 배열퀴즈2 {
    public static void main(String[] args) {
        // 배열 arr에서 int[] arr = {2,5,2,3,3,3,1,1,1,1}
        // 중복제거 해서 출력 = 1 2 3 5
        // 정렬해서 출력 = 1111223335
        // sort금지, 2중 for문 금지
        // 1~9 숫자 중이라고 가정


        int[] arr = {2,5,2,3,3,3,1,1,1,1};
        int[] arrList = new int[9];              // 각 배열의 순서를 숫자로 가정하고 갯수 카운트를 위한


        //arrList에 arr 1~9 숫자별로 카운트하기
        for(int i=0; i<arr.length; i++){
            //arr[i]에 -1 왜하냐? arrList length가 1~9를 가정하고 만들었기 때문에 0을 제외해야해서
            arrList[arr[i]-1]+=1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrList));

        for(int i=0; i<arrList.length; i++) {
            if (arrList[i] != 0) {
                System.out.print(i + 1);


            }
        }
        System.out.println();


        for(int i=0; i<arrList.length; i++) {
            if (arrList[i] != 0) {
                System.out.print(i + 1);
                arrList[i]--;
                //여기에서 for문의 i가 +1이 된다. 그러므로 이 아래부터는 i=1인 상태임
                i--;


            }
        }


   }
}
