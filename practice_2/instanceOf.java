package me.Gyojun.practice.practice_2;

// 부모 클래스
class Animal {
    public void speak() {
        System.out.println("Some generic animal sound");
    }

    public void performAction() {
        System.out.println("This is just a generic animal.");
    }
}

// 자식 클래스 1
class Dog extends Animal {
    public void fetch() {
        System.out.println("Dog is fetching the ball!");
    }

    @Override
    public void speak() {
        System.out.println("Woof woof!");
    }

    @Override
    public void performAction() {
        fetch();
    }
}

// 자식 클래스 2
class Cat extends Animal {
    public void scratch() {
        System.out.println("Cat is scratching the furniture!");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void performAction() {
        scratch();
    }
}

public class instanceOf {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Animal()};

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog d = (Dog)animals[0];
                d.speak(); // 공통 메서드 호출
                d.performAction(); // 각 클래스의 동작 호출
            } else if (animal instanceof Cat){
                Cat c = (Cat)animals[1];
                c.performAction();
                c.speak();
            } else {
                animal.performAction();
                animal.speak();
            }




        }
    }
}
