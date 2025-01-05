package me.Gyojun.practice.practice_1;

// 부모 클래스
class Animal__2 {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// 자식 클래스 1
class Dog__2 extends Animal__2 {
    @Override
    void sound() {
        System.out.println("Woof Woof!");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball!");
    }
}

// 자식 클래스 2
class Cat__2 extends Animal__2 {
    @Override
    void sound() {
        System.out.println("Meow Meow!");
    }

    void scratch() {
        System.out.println("Cat is scratching the furniture!");
    }
}




public class 객체형변환2 {

    public static void main(String[] args) {


        Animal__2 myAnimals = new Animal__2();
        Animal__2 myDog = new Dog__2();
        Animal__2 myCat = new Cat__2();

        myAnimals.sound();

        myDog.sound();
//        myDog.fetch();     //아하 여기서 부모 타입으로 자손객체 생성하니까 부모에는 fetch 메서드가 없어서 사용을 못하네
                            //  그러면 형변환을 다시 해서? im을 사용할 수 있도록 다운캐스팅 필요?
        myCat.sound();
//        myCat.scratch();  // 마찬가지


        if (myDog instanceof Dog__2){
            Dog__2 myRealDog = (Dog__2) myDog;
            myRealDog.fetch();
        }

        if (myCat instanceof Cat__2){
            Cat__2 myRealCat = (Cat__2) myCat;
            myRealCat.scratch();
        }

        try{
            Cat__2 realRealCat = (Cat__2) myDog;

        } catch (Exception e){
            System.out.println("형변환에 실패했습니다 : "+e.getMessage());
        }









    }






}
