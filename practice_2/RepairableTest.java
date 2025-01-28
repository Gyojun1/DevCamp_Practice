package me.Gyojun.practice.practice_2;


import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

interface Repairable{}

class Unit {
    int hitPoint;
    final int MAX_HP;
    Unit(int hp){
        MAX_HP = hp;
    }



}


class GroundUnit extends Unit{

    GroundUnit(int hp){
        super(hp);
    }

}

class AirUnit extends Unit{

    AirUnit(int hp){
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {

    Tank(){
        super(150); // Tank의 hp는 150이다
        hitPoint = 140;
    }

    public String toString() {
        return "TANK";
    }

}


class Marine extends GroundUnit {

    Marine(){
        super(40);         //Dropship의 hp는 125이다.
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Marine";
    }

}

class Dropship extends AirUnit implements Repairable{

    Dropship(){
        super(125);         //Dropship의 hp는 125이다.
        hitPoint = 120;
    }


    @Override
    public String toString() {
        return "Dropship";
    }
}


class Scv extends GroundUnit implements Repairable {

    Scv(){
        super(60);
        hitPoint = MAX_HP;
    }


    void repair(Repairable r){          // Repairable 인터페이스를 상속받은 클래스만 가능
        if (r instanceof Unit){
            Unit u = (Unit) r;
            while(u.hitPoint!=u.MAX_HP){// Unit의 HP를 증가시킨다

                try {
                    Thread.sleep(1000);
                    System.out.println("0");
                } catch (InterruptedException e){}

                    u.hitPoint++;

            }
            System.out.println(u.toString()+"의 수리가 끝났습니다.");
        }
    }




}


public class RepairableTest {
    public static void main(String[] args) {

        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        Scv scv = new Scv();

        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);


    }
}
