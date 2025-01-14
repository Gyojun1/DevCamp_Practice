package me.Gyojun.practice.practice_1;

public class DemonThread00 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(new DemonThread00());
        t1.setDaemon(true);   // 이 부분이 없으면 무한루프가 종료되지 않는다. 보조쓰레드 선언문이라고봐도 무방
        t1.start();

        for(int i=1; i <=15; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(i);
            if (i==5) autoSave = true;
        }



    }

    public void run(){
        while(true){
            try{
                Thread.sleep(3*1000); // 3초마다
            }catch(InterruptedException e) {}

            // autoSave의 값이 true면 autoSave()를 호출한다.
            if(autoSave) autoSave();
        }
    }

    public  void autoSave(){
        System.out.println("작업파일이 자동저장되었습니다.");
    }


}
