package me.Gyojun.practice.practice_1;

// 결제 인터페이스 정의
interface Payment {
    void pay(int amount);     // 결제 처리 메서드
    void refund(int amount);  // 환불 처리 메서드
}

// 카드 결제 구현 
class CardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원을 결제했습니다.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("카드로 " + amount + "원을 환불했습니다.");
    }
}

// 페이팔 결제 구현      // 오버라이딩으로 페이팔 구현부 작성하기
class PayPalPayment implements Payment {
    

    @Override
    public void pay(int amount) {
        System.out.println("PayPal로 " + amount + "원을 결제했습니다.");
    }


    @Override
    public void refund(int amount) {
        System.out.println("PayPal로 " + amount + "원을 환불했습니다.");
    }
}

// 휴대폰 결제 구현
class CellPhonePayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("가상 계좌로 " + amount + "원을 결제했습니다.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("가상 계좌로 " + amount + "원을 환불했습니다.");
    }
}

// 결제 처리 클래스
public class PaymentProcessor {
    public static void main(String[] args) {
        // 결제 방식 선택  인터페이스Payment타입의 paymentMethod를 선언함  (코드의 명확성을 위해서 좋은 방법인듯함)
        Payment paymentMethod;



        // 결제사용은 입력값을 받아야하고 각각 그 때마다 금액이 다르기 때문에 묶을 수 없어보임

        // 카드 결제를 사용            //  1번 카드결제 객체생성해서 pay refund까지
        paymentMethod = new CardPayment();
        paymentMethod.pay(50000);
        paymentMethod.refund(50000);

        System.out.println();

        // PayPal 결제를 사용  //  2번 페이팔 객체생성해서 pay refund까지
        paymentMethod = new PayPalPayment();
        paymentMethod.pay(30000);
        paymentMethod.refund(10000);

        System.out.println();

        // 핸드폰 결제를 사용  //  3번 휴대폰결제 객체생성해서 pay refund까지
        paymentMethod = new CellPhonePayment();
        paymentMethod.pay(70000);
        paymentMethod.refund(70000);






    }
}