package me.Gyojun.practice.practice_1;

// 결제와 환불 인터페이스
interface Payment2 {
    public abstract void pay(int money);
    void refund(int money);
}

// 카드결제 구현 클래스
class CardPayment2 implements Payment2{
    
    @Override
    public void pay(int money){
        System.out.println("카드로 "+money+"원 결제되었습니다.");
    }
    @Override
    public void refund(int money){
        System.out.println("카드로 "+money+"원 환불되었습니다.");
    }
}


// 페이팔결제 구현 클래스
class PaypalPayment2 implements Payment2{
    
    @Override
    public void pay(int money){
        System.out.println("Paypal로 "+money+"원 결제되었습니다.");
    }
    @Override
    public void refund(int money){
        System.out.println("Paypal로 "+money+"원 환불되었습니다.");
    }
}

// 휴대폰결제 구현 클래스
class CellphonePayment2 implements Payment2{

    @Override
    public void pay(int money){
        System.out.println("휴대폰으로 "+money+"원 결제되었습니다.");
    }
    @Override
    public void refund(int money){
        System.out.println("휴대폰으로 "+money+"원 환불되었습니다.");
    }
}


public class PaymentProcessor2 {

    public static void main(String[] args) {

        //인터페이스 타입의 paymentMethod를 선언을 함. 그냥 객체생성에서 타입을 공통적으로 뺄 수 있어서 깔끔함
        
        Payment2 paymentMethod;


        paymentMethod = new CardPayment2();
        paymentMethod.pay(50000);
        paymentMethod.refund(50000);


        paymentMethod = new PaypalPayment2();
        paymentMethod.pay(30000);
        paymentMethod.refund(30000);


        paymentMethod = new CellphonePayment2();
        paymentMethod.pay(460000);
        paymentMethod.refund(20000);


    }



    
    
    

}
