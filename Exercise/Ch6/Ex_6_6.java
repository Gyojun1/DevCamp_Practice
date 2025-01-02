package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_6 {
    //두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1){
        double a = Math.pow(x1-x, 2);
        double b = Math.pow(y1-y, 2);

        return Math.sqrt(a+b);
    }
        // 피타고라스 정의

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}

















