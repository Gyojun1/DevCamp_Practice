package me.Gyojun.practice.practice_1;

public class 별짓기3 {
    public static void main(String[] args) {


        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(!(i<j && i+j <4 || i>j && i+j >4)) {
                    System.out.printf("[%d,%d]", i, j);
//                    System.out.print("*");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }

//
//        for(int i=0; i<5; i++){
//            System.out.print("*****");
//            for(int k=0; k<i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i=1; i<10; i+=2){
            for(int j=10; j>i; j-=2){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }

            System.out.println();

        }


//        for(int i=0; i<6; i++){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//



    }
}
