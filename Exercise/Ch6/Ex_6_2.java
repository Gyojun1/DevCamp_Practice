package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());

    }
}

class SutdaCard{
    int num;
    boolean isKawng;

    SutdaCard(){
        super();
        num=1;
        isKawng=true;
    }
    SutdaCard (int a, boolean b){
        num = a;
        isKawng = b;
    }

    String info(){
        if (isKawng){
            return num+"K";
        }else {
            return num+"";
        }

    }

}