package me.Gyojun.practice.Exercise.Ch7;

class Parent{
    int x=100;

    Parent(){
        this(200);
    }

    Parent(int x){
        super(); // 생략가능
        this.x=x;
    }

    int getX() {
        return x;
    }

}

class Child extends Parent {
    int x = 3000;

    Child() {
        this(1000);
    }
    Child(int x) {
        super(); // 생략가능
        this.x = x;
    }

}



public class Ex_7_7 {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x="+c.getX());
    }

}
