package me.Gyojun.practice.Exercise.Ch3;


import org.w3c.dom.css.Rect;

class Point {

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


abstract class Shape {

    //어떤 공통분모를 뽑아낼건지?

    Point p;
    //iv 선언을 했다는 건 값을 초기회하겠다는 뜻. 즉, 생성자로 초기화를 해야 순리가 맞음


    // Shape의 기본생성자가 필요한가?  일단. 디폴트값이 명확하니까 만들어 놓는게 안전할듯함
//    Shape(){
//        this(new Point(0,0));
//    }

    Shape(Point p){
        this.p=p;
    }

    abstract double area();


}

class Circle extends Shape {

    double r;

    Circle(double r){
        this(new Point(0,0),r);
    }

    Circle(Point p,double r){
        super(p);
        this.r=r;

    }


    double area(){
        return r*r*Math.PI;
    }
}

class Rectangle extends Shape{

    double width;
    double height;

    Rectangle(double width,double height){
//        super(); // 이게 생략된건데 조상에 기본생성자가 없으니까 빨간줄이 뜨는거구나
        this(new Point(0,0),width,height);

    }

    Rectangle(Point p, double width, double height){
        super(p);
        this.width=width;
        this.height=height;
    }


    double area(){
        return width*height;
    }
}




public class Ex_7_22 {



    // 편하게 호출하려고 static을 고려할 수 있음
    // 객체의 상태를 참조하지 않고, 외부에서 전달받은 Shape[] 배열만 처리하므로, static으로 선언하는 것이 더 적합하다.
    double sumArea(Shape[] x){
        double sum = 0.0;
        for(int i=0; i<x.length; i++){
            sum+=x[i].area();
        }
        return sum;
    }


    //부모 타입의 배열에 자손 객체를 저장하는 것은 다형성의 개념이다.
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0),new Rectangle(3,4),new Circle(1)};


      //  System.out.println(sumArea(arr));

    }
}
