package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_3 {

    public static void main(String[] args) {


        // 규칙을 보고 배열을 만들어서 1~10까지 넣어야겠다고 생각을 했고 규칙을 찾아 2중 for문을 씀
        // i가 1로 시작해야 j가 처음에 돌 수 있어서  굳이 포인트를 짚자면 그 부분입니다.


        int sum=0;

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i=1; i<11; i++){
            for (int j=0; j<i; j++){
                sum+=arr[j];
//                System.out.print(arr[j]+" ");
            }
        }
        System.out.println(sum);

    }

}




















