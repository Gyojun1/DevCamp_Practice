package me.Gyojun.practice.practice_1;

import java.util.Scanner;

class TV {
    int channel = 1;
    int volume = 1;
    boolean power = false;

    static int width = 50;
    static int height = 150;

    static void printSize() {
        System.out.println("가로가 " + TV.width + "mm이고 높이가 " + TV.height + "mm인 TV 리모콘을 집었다.");
    }

    void channelUp() {
        channel++; // 채널 1 증가
        if (channel > 13) {
            channel = 1;
        }
    }

    void channelDown() {
        channel--; // 채널 1 감소
        if (channel < 1) {
            channel = 13;
        }
    }

    void volumeup() {
        volume++; // 볼륨 1 증가
        if (volume > 20) {
            volume--;

        }

    }

    void volumeDown() {
        volume--; // 볼륨 1 감소
        if (volume < 0) {
            volume++;
            System.out.println("음소거 입니다.");
        }
    }

    void togglePower() {
        power = !power;
    }

}

class TVmain {
    public static void main(String[] args) {

        TV myTV = new TV();
        Scanner scanner = new Scanner(System.in);

        TV.printSize();
        System.out.println("어떤걸 누를 것인가?");

        System.out.println("1.전원 2.채널올리기 3.채널내리기 4.볼륨올리기 5.볼륨내리기");

        for (int i = 0; i < 50; i++) {

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (myTV.power == false) {

                        myTV.togglePower();
                        System.out.println("TV가 켜집니다.");
                    } else {
                        myTV.togglePower();
                        System.out.println("TV가 꺼집니다.");
                    }

                    break;
                case 2:
                    myTV.channelUp();
                    System.out.println("채널 " + myTV.channel + "로 변경되었습니다.");

                    break;
                case 3:
                    myTV.channelDown();
                    System.out.println("채널 " + myTV.channel + "로 변경되었습니다.");
                    break;

                case 4:

                    if (myTV.volume == 20) {
                        System.out.println("볼륨이 최대입니다.");

                    } else {
                        myTV.volumeup();
                        System.out.println("볼륨 " + myTV.volume + "로 변경되었습니다.");
                    }

                    break;

                case 5:

                    if (myTV.volume == 0) {
                        System.out.println("볼륨이 최소입니다.");

                    } else {
                        myTV.volumeDown();
                        System.out.println("볼륨 " + myTV.volume + "로 변경되었습니다.");
                    }

                    break;

            }
        }
        scanner.close();
    }
}
