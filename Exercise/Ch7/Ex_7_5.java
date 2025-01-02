package me.Gyojun.practice.Exercise.Ch7;


// 프로덕트 클래스 iv값 2개와 생성자
class Product{
    int price;
    int bonusPoint = (int)(price/10.0);


    // 기본 생성자
    Product(){

        this(100000);
    }

    Product(int price){
        super(); // 생략가능 생성자 첫 줄에 반드시 다른 생성자를 호출해야한다.
        this.price=price;
        bonusPoint=(int)(price/10.0);
    }


}
// 자손클래스
class Tv extends Product {

    // 첫줄 반드시 다른생성자 호출해야
    Tv() {
        super();
    }

    @Override
    public String toString() {

        return "Tv";
    }
}


public class Ex_7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
        System.out.println(t.toString());
    }

}
