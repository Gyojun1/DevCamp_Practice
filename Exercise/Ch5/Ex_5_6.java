package me.Gyojun.practice.Exercise.Ch5;

public class Ex_5_6 {
    public static void main(String[] args) {
        //큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int[] coinUnit = {500,100,50,10};

        int money = 2680;
        System.out.println("money="+money);

        
        for(int i = 0; i< getLength(coinUnit); i++){ // 왜 for문을 두 번을 돌릴까?
            int cnt=0;
            for(int j=0; j<i; j++ ){    //빼면서 카운트를 돌림
                if (money<500) {
                    System.out.println("500원:"+cnt);
                    cnt=0;
                    if (money<100){
                        System.out.println("100원:"+cnt);
                        cnt=0;
                        if (money<50) {
                            System.out.println("50원:" + cnt);
                            cnt=0;
                            if (money<10) {
                                System.out.println("10원:" + cnt);
                                cnt=0;
                            } else {
                                money -= coinUnit[j];
                                cnt++;
                                j--;
                            }


                            }else{
                            money -= coinUnit[j];
                            cnt++;
                            j--;
                        }
                    } else {
                        money -= coinUnit[j];
                        cnt++;
                        j--;
                    }
                } else {
                    money -= coinUnit[j];
                    cnt++;
                    j--;
                }
            }

        }
//
//            System.out.println("100원:"+b);
//            System.out.println("50원:"+c);
//            System.out.println("10원:"+d);
        }

    private static int getLength(int[] coinUnit) {
        return coinUnit.length;
    }

}

