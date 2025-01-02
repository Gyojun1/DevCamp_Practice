package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_23 {

    static int max(int[] a){
//        if (a == null ){
//            return -999999;
//        }
//        if a[0] =
        int max = a[0]; // 첫 번째 값을 초기 최대값으로 설정
        for (int num : a) {
            if (num > max) {
                max = num; // 더 큰 값을 찾으면 업데이트
            }
        }
        return max;


    }


    
    public static void main(String[] args) {

        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));  // 크기가 0인 배열

    }
}
