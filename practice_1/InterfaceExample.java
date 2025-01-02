package me.Gyojun.practice.practice_1;

interface Animal {

    void makeSound();
    void move();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("멍멍");
    }

    public void move() {
        System.out.println("뭉뭉");
    }
}


class Cat implements Animal {
    public void makeSound() {
        System.out.println("야옹");
    }

    public void move() {
        System.out.println("냥냥");
    }


}




// 인터페이스가 뭐야? 사용자는 바꿀필요없이 껍데기와 연결시키고 그 껍데기 안에 있는 내용물만 변경시킬 수 있는 것



public class InterfaceExample {
    public static void main(String[] args) {

        // 인터페이스를 이용해서 dog와 cat에 접근하기 위해서는 먼저 인터페이스 객체생성
//        Animal ani = new Dog();
//        Animal ani2 = new Cat();
//
//        ani.makeSound();
//        ani.move();
//
//        ani2.makeSound();
//        ani2.move();


        Animal[] animals = {new Dog(),new Cat()};

        for (Animal ani : animals){
            ani.move();
            ani.makeSound();
        }


//
//        for (int i=0; i<ani.length; i++){
//            ani[i].move();
//            ani[i].makeSound();
//        }








        }






    }
