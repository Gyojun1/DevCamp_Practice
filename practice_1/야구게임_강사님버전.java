package me.Gyojun.practice.practice_1;

public class 야구게임_강사님버전 {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] input = {2,1,3};
        int strike = 0; //strike의 개수를 저장
        int ball = 0; //ball의 개수를 저장


        //비교

        for(int i=0; i<a.length;i++){
            for(int j=0; j<input.length; j++){
                if (a[i]==input[j]){
                    if(i==j)
                        strike++;
                    else
                        ball++;
                }
            }
        }

        if(a[0] ==input[0]) strike++;
        if(a[0] ==input[0]) strike++;
        if(a[0] ==input[0]) strike++;

        if(a[0] ==input[0]) strike++;
        if(a[0] ==input[0]) strike++;
        if(a[0] ==input[0]) strike++;

        if(a[0] ==input[0]) strike++;
        if(a[0] ==input[0]) strike++;
        if(a[0] ==input[0]) strike++;







        //결과 출력
        System.out.printf("%dS%dB%n", strike, ball);


    }
}
