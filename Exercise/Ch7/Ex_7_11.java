package me.Gyojun.practice.Exercise.Ch7;


class MyTv2 {

    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    int prevChannel1 ;

    int prevChannel ;

    void setChannel(int a){

        if (a>MIN_CHANNEL && a<MAX_CHANNEL) {
            channel=a;
            prevChannel = prevChannel1;
            prevChannel1 = channel;

        }

    }

    void setVolume(int a){

        if (a>MIN_VOLUME && a<MAX_VOLUME) {
            volume = a;
        }

    }

    void setPowerOn() {
        isPowerOn = !isPowerOn;
    }


    void getPowerOn(){
        if(isPowerOn==true){
            System.out.println("Tv가 켜졌습니다.");
        }
        else{
            System.out.println("Tv가 꺼졌습니다.");
        }

    }




    int getChannel(){

        return channel;
    }

    int getVolume(){

        return volume;

    }

    void gotoPrevChannel(){


        channel = prevChannel;
        prevChannel = prevChannel1;
        prevChannel1 = channel;



    }
}




public class Ex_7_11 {

    public static void main(String[] args) {

        MyTv2 t = new MyTv2();


        t.setVolume(50);
        System.out.println("VOL:"+t.getVolume());

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());

        t.setPowerOn();
        t.getPowerOn();
        t.setPowerOn();
        t.getPowerOn();





    }
}
