package me.Gyojun.practice.practice_1;

public class Q2 {
    public static void main(String[] args) {


        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,0,1},
                {1,0,1,1,1},
                {1,1,1,1,1}
        };
        int bingo = 0;
        // 빙고 카운트 하기
        for (int i=0; i<5; i++){
            System.out.println(arr[0][i]);
        }

        //가로비교
        for (int i=0; i<5; i++){
            if(
                    arr[0][0] == (arr[0][1]) &&
                            arr[0][1] == (arr[0][2]) &&
                            arr[0][2] == (arr[0][3]) &&
                            arr[0][3] == (arr[0][4])

            ) {
                bingo++;
            }
        }


        //대각선 비교 x==y || x+y=4


       if( arr[0][0] == (arr[1][1]) &&
        arr[1][1] == (arr[2][2]) &&
                arr[2][2] == (arr[3][3]) &&
                arr[3][3] == (arr[4][4])
                ){
           bingo++;
       }




    }
}
