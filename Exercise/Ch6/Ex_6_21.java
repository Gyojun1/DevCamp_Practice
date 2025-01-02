package me.Gyojun.practice.Exercise.Ch6;

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        isPowerOn = !isPowerOn;
    }

    void volumeUp(){
        if (volume < MAX_VOLUME){
            volume++;
        } else {
            System.out.println("볼륨 최대치 입니다.");
        }
    }

    void volumeDown(){
        if (volume > MIN_VOLUME){
            volume--;
        } else {
            System.out.println("볼륨 최소치 입니다.");
        }
    }

    void channelUp(){
        if (channel < MAX_CHANNEL){
            channel++;
        } else {
            channel = MIN_CHANNEL;
        }
    }
    void channelDown(){
        if (channel > MIN_CHANNEL){
            channel--;
        } else {
            channel = MAX_CHANNEL;
        }
    }


}



class Ex_6_21 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);




    }
}
























