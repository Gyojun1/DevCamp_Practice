package me.Gyojun.practice.practice_1;


class Point {
    int x;
    int y;


    Point(){
        this(0,0);
    }

    Point(int x, int y){
        super(); // 생략가능
        this.x=x;
        this.y=y;
    }


}

abstract class Shape_ {

    //각 도형들의 공통분모 = 위치

    Point p;

    Shape_(){
        this(new Point(0,0));
    }

    Shape_(Point p){
        this.p=p;
    }

    abstract double area_();


}


class Circle_ extends Shape_{

    double r;


    // 위치를 넣지 않았을 때 기본값을 추가해줘야함 디폴트는 0,0
    Circle_(double r){
        this(new Point(0,0),r);
    }

    Circle_(Point p, double r){
        super(p);
        this.r=r;
    }



    double area_(){
        return r*r*Math.PI;
    }

}


class Rectangle_ extends Shape_{

    double width;
    double height;


    Rectangle_(double width, double height){
        this(new Point(0,0),width,height);
    }


    Rectangle_(Point p,double width, double height){
        super(p);
        this.width=width;
        this.height=height;
    }




    double area_(){
        return width*height;
    }

}








public class ShapeArea {

    static double sumArea_(Shape_[] a){

        double sum = 0.0;

        for (int i = 0; i < 3; i++) {
            sum += a[i].area_();
        }
        return sum;
    }


    public static void main(String[] args) {

        Shape_[] arr = {new Circle_(5.0), new Rectangle_(3,4),new Circle_(1)};

        System.out.println("총 면적의 합계:"+sumArea_(arr));

    }
}
