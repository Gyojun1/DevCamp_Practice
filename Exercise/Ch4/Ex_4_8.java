package me.Gyojun.practice.Exercise.Ch4;

public class Ex_4_8 {
    public static void main(String[] args) {

        for(int x=0; x<11; x++){
            for(int y=0; y<11; y++){
                if(2*x+4*y==10){
                    System.out.println("x="+x+", y="+y);
                }
            }
        }
    }
}
