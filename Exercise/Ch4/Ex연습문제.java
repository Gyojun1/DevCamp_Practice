package me.Gyojun.practice.Exercise.Ch4;


class Point{
    int x;
    int y;

    Point(){
        this(0,0);
    }

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}


//각 도형들의 공통분모 위치를 뽑아낸 클래스, 그리고 도형들을 더 늘리더라도 확장성이 있음
abstract class Shape{

    Point p;

    Shape(){
        
        this(new Point(0,0));

    }

    Shape(Point p){
        super();
        this.p=p;
    }



    abstract double calcArea();

}


class Circle extends Shape {
    double r;

    Circle(double r){
        this(new Point(0,0),r);
    }

    Circle(Point p, double r){
        super(p);
        this.r=r;
    }


    double calcArea(){
        return r*r*Math.PI;
    }

}

class Rectangle extends Shape {
    double width;
    double height;


    Rectangle(double width, double height){
        this(new Point(0,0),width,height);
    }

    Rectangle(Point p,double width, double height){
        super(p);
        this.width=width;
        this.height=height;
    }

    double calcArea(){
        return width*height;
    }



}






public class Ex연습문제 {


    static double sumArea(Shape[] x){
        double y=0.0;

        for (int i=0; i<x.length; i++) {
            y += x[i].calcArea();

        }
        return y;
    }


    public static void main(String[] args) {



        Shape[] arr = {new Circle(5.0), new Rectangle(3,4),new Circle(1)};


        System.out.println("면적의 합:"+sumArea(arr));








    }

}
