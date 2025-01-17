package me.Gyojun.practice.practice_1;

import java.util.ArrayList;

class Customer2 implements Runnable{
    private Table2 table;
    private String food;

    Customer2(Table2 table, String food){
        this.table = table;
        this.food = food;
    }

    public void run(){
        while(true){
            try {Thread.sleep(100);} catch (InterruptedException e) {}

            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name+" ate a "+food);
        } //while
    }
}

class Cook2 implements Runnable {
    private Table2 table;

    Cook2(Table2 table){this.table=table;}

    public void run() {
        while (true) {
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);
            try{Thread.sleep(10);} catch (InterruptedException e) {}
        }  // while
    }
}

class Table2 {

    //dishNames 라는 문자열 배열을 만들어서 메뉴 3개를 세팅함
    String[] dishNames = { "donut", "pizza","burger"};
    // Table에 올라갈 수 있는 음식은 최대 6개 고정값으로 final 사용
    final int MAX_FOOD = 6;


    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while (dishes.size()>=MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name+" 가 기다리고있습니다.");
            try{
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
        dishes.add(dish);
        notify();
        System.out.println("Dishes : "+dishes.toString());
    }

    public  void remove(String dishName){
        synchronized (this) {
            String name = Thread.currentThread().getName();

            while(dishes.size()==0){
                System.out.println(name+"가 기다리고 있습니다.");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e){}
            }

            while(true){
                for(int i=0; i<dishes.size(); i++){
                    if(dishName.equals(dishes.get(i))){
                        dishes.remove(i);
                        notify(); // 잠자고 있는 COOK을 꺠우기위함
                        return;
                    }
                } // for문 끝

                try{
                    System.out.println(name+" is waiting.");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {}

            }   // while(true)
        }   //synchronized
    }
    public int dishNum() {return dishNames.length;}

}


public class ThreadEx_1 {
    public static void main(String[] args) {
        Table2 table = new Table2();

        new Thread(new Cook2(table), "COOK").start();
        new Thread(new Customer2(table, "donut"),"CUST1").start();
        new Thread(new Customer2(table, "burger"),"CUST1").start();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.exit(0);
    }
}
