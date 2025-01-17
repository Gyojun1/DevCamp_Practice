package me.Gyojun.practice.practice_1;


class MyThread extends Thread {

    @Override
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println(0);
        }
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println(1);
        }
    }
}



public class Thread00 {
    static long startTime = 0;

    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        Runnable r = new MyThread2();
        Thread t2 = new Thread(r);

        startTime = System.currentTimeMillis();


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(InterruptedException e){}

        System.out.println("소요시간 : "+(System.currentTimeMillis() - startTime));



    }

}
