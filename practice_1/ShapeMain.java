package me.Gyojun.practice.practice_1;

// 추상 클래스 Shape
abstract class Shape {
    abstract void draw();  // 추상 메서드
}

// 사각형 클래스 (Shape를 상속)
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("사각형을 그립니다.");
    }
}

// 원 클래스 (Shape를 상속)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("원을 그립니다.");
    }
}

// 삼각형 클래스 (Shape를 상속)
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("삼각형을 그립니다.");
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        // Shape 타입의 변수로 다양한 도형 객체를 참조
        Shape myShape;

        myShape = new Rectangle();  // Rectangle 객체 참조
        myShape.draw();  // 사각형을 그립니다.

        myShape = new Circle();  // Circle 객체 참조
        myShape.draw();  // 원을 그립니다.

        myShape = new Triangle();  // Triangle 객체 참조
        myShape.draw();  // 삼각형을 그립니다.
    }
}