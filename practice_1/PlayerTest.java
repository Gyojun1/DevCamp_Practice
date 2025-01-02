package me.Gyojun.practice.practice_1;

abstract class Player {
    abstract  void play(int pos); // 추상 메서드 (미완성 메서드)
    abstract void stop();   //추상 메서드 (선언부만 있음는 메서드)
}
class AudioPlayer extends Player {
    void play(int pos){
        System.out.println(pos+"위치부터 play합니다.");

    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}

//추상 클래스는 상속을 통해 완성해야 객체 생성 가능
public class PlayerTest {
    public static void main(String[] args) {
        Player ap = new AudioPlayer() ;
        ap.play(100);
        ap.stop();


    }
}




