package me.Gyojun.practice.practice_1;

class Q1Q2{


    void mid(int a, int b, int c){
        
        if(b<a && a<c || c<a && a<b){
            System.out.println("중간값 : %d"+a);
        }

        if(a<b && b<c || c<b && b<a){
            System.out.println("중간값 : %d"+b);
        }

        if(a<c && c<b || b<c && c<a){
            System.out.println("중간값 : %d"+c);
        }



    }
}

public class Q1 {

    //3개의 정수를 입력받아서 2번째로 큰 값을 반환하는 mid() 메서드를 작성하시오
    // 5x5크기의 2차원 배열을 입력 받아서 bingo 개수를 반환하는 bingoCount() 메서드를 작성하시오

    public static void main(String[] args) {


        // 빙고란 1.가로 5개가 같거나 2.세로 5개가 같거나 3. 대각선 5개가 같거나

        // 가능한 부분: 대각선이나 세로,가로의 빙고를 [%d,%d] 형식으로 도출할 수 있음
        // 문제1. [%d,%d]의 형식과 실제 그 주소에 있는 값의 연결
        // 문제2. 그러면 값은 굳이 정수로 할 필요가 없겠네????  o x니까 boolean 타입을 이용하는게 좋아보이네?

        // 가장 헷갈리는 부분?

        // 빙고의 조건 x==0,1,2,3,4 || y==0,1,2,3,4 || x==y || x+y==4   여기에 있는 각각의 조건의 배열값이 True일때



        boolean[][] arr = new boolean[5][5];

        // 출력값 테스트를 위한 true 값 넣어보기
        for (int i=0; i<5; i++){
            arr[0][i] = true;
        }
        for (int i=0; i<5; i++){
            arr[1][i] = true;
        }
        for (int i=0; i<5; i++){
            arr[2][i] = true;
        }
        for (int i=0; i<5; i++){
            arr[3][i] = true;
        }
        for (int i=0; i<5; i++){
            arr[4][i] = true;
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(arr[i][j]);
                System.out.printf("[%d,%d]",i,j);
            }
            System.out.println();
        }

        int cnt=0;      //빙고 한줄이 완성 되었는지 카운트
        int bingo=0;    // 빙고 카운트

        // 무식하게 true값 빙고맞추기
        for (int i=0; i<5; i++){
            if (arr[0][i]) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;
        //
        for (int i=0; i<5; i++){
            if (arr[1][i]) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;
        //
        for (int i=0; i<5; i++){
            if (arr[2][i]) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;
        //
        for (int i=0; i<5; i++){
            if (arr[3][i] == true) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;
        //
        for (int i=0; i<5; i++){
            if (arr[4][i] == true) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;

        //
        for (int i=0; i<5; i++){
            if (arr[i][0] == true) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;
        //
        for (int i=0; i<5; i++){
            if (arr[i][1] == true) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;

        //
        for (int i=0; i<5; i++){
            if (arr[i][2] == true) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;
        //
        for (int i=0; i<5; i++){
            if (arr[i][3] == true) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;
        //
        for (int i=0; i<5; i++){
            if (arr[i][4] == true) {
                cnt++;
            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;


        // 대각선
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++) {

                if(i==j){
                    if (arr[i][j]){
                        cnt++;
                    }
                }

            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;

        // 대각선
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++) {

                if(i+j==4){
                    if (arr[i][j]){
                        cnt++;
                    }
                }

            }
        }
        if (cnt == 5){
            bingo++;
            cnt=0;
        } else
            cnt=0;

        System.out.println(bingo);















        Q1Q2 q1 = new Q1Q2();

        q1.mid(100,1000,10);



    }
}




