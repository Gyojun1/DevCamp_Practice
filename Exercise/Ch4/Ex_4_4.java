package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_4 {

    public static void main(String[] args) {



//        for(int i=1; i<101; i++){
//            if (-i*2)
//        }

        int x=0;
        int i =0;
        int cnt =0;

        while(x<1000){

                i++;
                cnt++;
                if(i%2!=0){
                    x+=i;
                }else {
                    x-=i;
                }

            System.out.println(x);
            }
        System.out.println("카운트:"+cnt);



        }


//        System.out.println(x);





    }


