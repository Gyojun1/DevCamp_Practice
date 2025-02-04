package me.Gyojun.practice.Exercise.Ch7_1;

import java.util.Arrays;

public class Ex_7_19 {
    public static void main(String[] args) {

        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}


class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p){
        /*
        가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다. -- if문
        가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고  --
        장바구니에 구입한 물건을 담는다 (add 메서드 호출)
        */
        if (money>p.price) {
            money-= p.price;
            add(p);
        } else {
            System.out.println("돈이 부족해서 "+p+"를 살 수 없습니다.");
        }
    }


    void add (Product p){

        /*
            int money = 1000;
            Product[] cart = new Product[3];
            int i = 0;

            i의 값이 장바구니의 크기보다 같거나 크면
            기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
            기존의 장바구니의 내용을 새로운 배열에 복사한다.
            새로운 장바구니와 기존의 장바구니를 바꾼다.

            물건을 장바구니에 저장한다. 그리고 i의 값을 1 증기시킨다.
         */

        if( this.i>=cart.length){
            Product[] tmp = new Product[cart.length*2];
            System.arraycopy(cart,0,tmp,0,cart.length);
            cart=tmp;
            cart[this.i++]=p;
        }
        else {
            cart[this.i++]=p;
        }
    }

    void summary(){
        /*
            장바구니에 담긴 물건들의 목록을 만들어 출력한다.
            장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
            물건을 사고 남은 금액(money)을 출력한다.
         */
        int sum=0;

        System.out.println(Arrays.toString(cart));
        for(int j=0; j< cart.length; j++){
            if (cart[j] != null){

                sum+=cart[j].price;
            }
        }
        System.out.println("사용한 금액:"+sum);
        System.out.println("남은 금액:"+money);


    }



}

class Product {
    int price;

    Product(int price){
        this.price=price;
    }
}

class Tv extends Product {
    Tv() {super(100);}
    public String toString() {return "Tv";}
}

class Computer extends Product{
    Computer() {super(200);}
    public String toString() {return "Coumputer";}
}

class Audio extends Product{
    Audio() {super(50);}
    public String toString() {return "Audio";}
}





