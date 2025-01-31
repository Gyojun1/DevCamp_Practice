package me.Gyojun.practice.Exercise.Ch7_1._2;

interface Repairable {}

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


class Tank extends GroundUnit implements Repairable{

    Tank(){
        super(150);
        hitPoint = 145;

    }

    public String toString() {return "TANK";}

}

class Marine extends GroundUnit{

    Marine(){
        super(40);
        hitPoint=MAX_HP;
    }

}

class Dropship extends AirUnit implements Repairable{


    Dropship(){
        super(125);
        hitPoint = 120;

    }

    public String toString(){return "Dropship";}

}

class Scv extends GroundUnit implements Repairable{

    Scv(){
        super(60);
        hitPoint = 50;
    }

    void repair(Repairable r){
        if(r instanceof Unit){
            Unit u = (Unit) r;
            while(u.hitPoint != u.MAX_HP){
                u.hitPoint++;

                try{
                    Thread.sleep(1000);
                    System.out.println("1 회복");
                } catch (InterruptedException ie){

                    System.out.println("스레드가 인터럽트됨!");
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(u.toString()+"의 수리가 끝났습니다.");

        }



    }

    public String toString(){
        return "Scv";
    }


}



public class RepairableTest3 {
    public static void main(String[] args) {

        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Scv scv = new Scv();


        scv.repair(tank);
        scv.repair(dropship);

        scv.repair(scv);




    }
}
