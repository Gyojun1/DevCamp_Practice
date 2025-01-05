package me.Gyojun.practice.practice_1;

// 부모 클래스
class Animal__ {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// 자식 클래스 1
class Dog__ extends Animal__ {
    @Override
    void sound() {
        System.out.println("Woof Woof!");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball!");
    }
}

// 자식 클래스 2
class Cat__ extends Animal__ {
    @Override
    void sound() {
        System.out.println("Meow Meow!");
    }

    void scratch() {
        System.out.println("Cat is scratching the furniture!");
    }
}

public class 객체형변환 {
    public static void main(String[] args) {
        // 업캐스팅(자동 형변환)
        Animal__ myDog = new Dog__();
        Animal__ myCat = new Cat__();

        // 업캐스팅된 객체 사용
        myDog.sound();  // 출력: Woof Woof!
        myCat.sound();  // 출력: Meow Meow!

        // 다운캐스팅(명시적 형변환)
        if (myDog instanceof Dog__) {
            Dog__ specificDog = (Dog__) myDog;
            specificDog.fetch();  // 출력: Dog is fetching the ball!
        }

        if (myCat instanceof Cat__) {
            Cat__ specificCat = (Cat__) myCat;
            specificCat.scratch();  // 출력: Cat is scratching the furniture!
        }

        // 잘못된 다운캐스팅 예 (실행 시 ClassCastException 발생)
        try {
            Dog__ wrongCasting = (Dog__) myCat; // Cat을 Dog로 캐스팅 시도
        } catch (ClassCastException e) {
            System.out.println("다운캐스팅 실패: " + e.getMessage());
        }
    }
}