package me.Gyojun.practice.practice_1;


//인터페이스 2가지 기능(메서드) 선언
interface Payment3 {
    public abstract void pay (int price);
    void refund(int price);

}


// 인터페이스 2가지 메서드 구현부 작성 3가지 클래스로
class CardPayment3 implements Payment3{

    @Override
    public void pay(int price){
        System.out.println("카드로 "+price+"원 결제되었습니다.");
    }
    @Override
    public void refund(int price){
        System.out.println("카드로 "+price+"원 환불되었습니다.");
    }
}


class PaypalPayment3 implements Payment3{
    @Override
    public void pay(int price){
        System.out.println("Paypal로 "+price+"원 결제되었습니다.");
    }
    @Override
    public void refund(int price){
        System.out.println("Paypal로 "+price+"원 환불되었습니다.");
    }
}

class CellPhonePayment3 implements Payment3{
    @Override
    public void pay(int price){
        System.out.println("휴대폰으로 "+price+"원 결제되었습니다.");
    }
    @Override
    public void refund(int price){
        System.out.println("휴대폰으로 "+price+"원 환불되었습니다.");
    }
}



public class PaymentProcessor3 {
    public static void main(String[] args) {

        // 타입선언
        Payment3 p;

                p = new CardPayment3();
        p.pay(500000);
        p.refund(500000);

        p = new PaypalPayment3();
        p.pay(890000);
        p.refund(890000);

        p = new CellPhonePayment3();
        p.pay(49000);
        p.refund(49000);



    }




}
