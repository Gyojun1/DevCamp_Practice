package me.Gyojun.practice.practice_1;


// 결제, 환불을 하는 인터페이스 . 종류에는 카드결제 Paypal 휴대폰결제가 있음


interface Payment4 {

    public abstract void pay(int price);
    public abstract void refund(int price);

}

class CardPayment4 implements Payment4 {

    @Override
    public void pay(int price) {
        System.out.println("카드로 "+price+"원 결제합니다.");
    }

    @Override
    public void refund(int price) {
        System.out.println("카드로 "+price+"원 환불합니다.");
    }
}

class PaypalPayment4 implements Payment4 {

    @Override
    public void pay(int price){
        System.out.println("Paypal로 "+price+"원 결제합니다.");
    }
    @Override
    public void refund(int price){
        System.out.println("Paypal로 "+price+"원 결제합니다.");

    }
}
class CellphonPayment4 implements Payment4 {
    public void pay(int price){
        System.out.println("휴대폰으로 "+price+"원 결제합니다.");
    }
    public void refund(int price){
        System.out.println("휴대폰으로 "+price+"원 환불합니다.");
    }
}




public class PaymentProcessor4 {
    public static void main(String[] args) {

        Payment4 p;

        //카드결제 구현부
        p = new CardPayment4();
        p.pay(50000);
        p.refund(50000);

        // Paypal결제 구현부
        p = new PaypalPayment4();
        p.pay(30000);
        p.refund(30000);

        //휴대폰결제 구현부
        p = new CellphonPayment4();
        p.pay(10000);
        p.refund(10000);








    }


}
