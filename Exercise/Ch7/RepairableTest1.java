package me.Gyojun.practice.Exercise.Ch7;


public class RepairableTest1 {

    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();

        SCV scv = new SCV();


        scv.repair(tank);   //SCV 가 Tank를 수리하도록 한다.
        scv.repair(dropship);
        scv.repair(scv);
//        scv.repair(marine);


    }
}


interface Repairable {}        // 인터페이스로 메서드 없이 묶기만 하기도 하네?

class Unit {
    int hitPoint;       //iv 1개
    final int MAX_HP;   // 상수 1개      이게 뭘까? 맥스 HP? 그냥 최대 hp를 뜻하는 건가? 그러겠네? 처음 초기화 최대 hp 고정시키고 ㅇㅇ


    // 생성자
    Unit(int hp) {
        MAX_HP = hp;
    }
}


class GroundUnit extends Unit{
    GroundUnit(int hp){
        super(hp);
    }
}

class AirUnit extends Unit {

    AirUnit(int hp){
        super(hp);
    }

}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);     // 탱크의 HP는 150이다.
        hitPoint = MAX_HP;
    }
}


class Dropship extends AirUnit implements Repairable{
    Dropship(){
        super(125);     // Dropship의 HP는 125이다.
        hitPoint = MAX_HP;
    }

    public String toString(){
        return "Dropship";
    }

}


class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}


class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair (Repairable r){
        if (r instanceof Unit){
            Unit u = (Unit)r;
            while(u.hitPoint != u.MAX_HP){
                //Unit의 HP를 증가시킨다.
                u.hitPoint++;
            }
            System.out.println(u.toString() +"의 수리가 끝났습니다.");
        }


    }



}























