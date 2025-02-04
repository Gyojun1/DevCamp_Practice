package me.Gyojun.practice.Exercise.Ch7;



abstract class Shape{
    Point p;

    Shape(){            // 가로 세로
        this(new Point(0,0));
    }

    Shape(Point p){         //원 반지름
        this.p=p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    Point getPosition(){
        return p;
    }

    void setPosition(Point p){
        this.p=p;
    }

}


class Point {
    int x;
    int y;

    Point() {
        this(0,0);
    }

    Point(int x, int y){
        super();
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "["+x+","+y+"]";
    }

}

/// ////////////////////////////////

class Circle extends Shape {

    double r;


    Circle(double r){
        this(new Point(0,0),r); // Circle(Point p, double r)를 호출
    }

    Circle(Point p, double r) {
        super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
        this.r =r;
    }

    double calcArea(){
        return Math.PI*r*r;
    }

}


class Rectangle extends Shape {

    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }


    Rectangle(Point p, double width, double height) {
        super(p);              // 조상의 멤버는 조상의 생성자가 초기화하도록 한다. 즉, shape에서 관리를 하도록함.
        this.width = width;
        this.height = height;

    }

    double calcArea() {
        return width * height;
    }
}




/////////////////////////////////////////











public class Ex_7_23 {

    static double sumArea(Shape[] arr){    // 메인 클래스안에 메서드를 넣음으로써 (+static) 메서드 이름만 가지고 호출이 가능하다.
        double sum=0;

        for(int i=0; i<arr.length;i++){
            sum+=arr[i].calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("면적의 합:"+sumArea(arr));
    }


}