package me.Gyojun.practice.Exercise.Ch6;

class MyPoint_6_7 {
    int x;
    int y;

    MyPoint_6_7(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistance(int a,int b){
        double i = (double)Math.pow(a, x);
        double j = (double)Math.pow(b, y);

        return (double)Math.sqrt(i+j);

    }
}


public class Ex_6_7 {
    public static void main(String[] args) {
        MyPoint_6_7 p = new MyPoint_6_7(1,1);

        //p와 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}
