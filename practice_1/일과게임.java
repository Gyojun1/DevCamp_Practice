package me.Gyojun.practice.practice_1;

import java.util.*;

public class 일과게임 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("일요일 아침 6시에 알람이 울린다.");
        System.out.println("어떻게 하겠는가?");
        System.out.println("1.일어난다. 2.알람을 끄고 늦잠을 잔다.");

        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("일어나서 양치를하고 빨래를 돌려놓고 주변을 산책하면서 이어폰으로 노래를 듣는다.");
            System.out.println();
            System.out.println("아침에 콘프러스트를 먹을까? 말까?");
            System.out.println("1. 먹는다. 2. 먹지않는다.");
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("우마이");
                System.out.println();
                System.out.println("준비를 하고 밖으로 나왔다.");
                System.out.println("어디를 가야하지?");
                System.out.println("1. 도서관  2. 카페");
                int b = scanner.nextInt();
                if (b == 1) {
                    System.out.println("도서관이 어디있는지 찾지못해 미아가 되었다.");
                } else if (b == 2) {
                    System.out.println("카페에 내가 첫 손님이다. 내가 항상 공부하는 자리가 비어있다. 개꿀");
                    System.out.println();
                    System.err.println("점심먹을시간이 되었다. 뭘 먹으러 가지?");
                    System.out.println("1. 규동  2. 카페케잌");
                    int c = scanner.nextInt();
                    if (c == 1) {
                        System.out.println("김치나베 우마이~");
                        System.out.println();
                        System.out.println("앉아서 공부를 하려는데 어떤 공부를 할까?");
                        System.out.println("1. 인강  2. 코드작성  3.그냥 나가놀기  4.크로플사먹으러 가기");
                        int d = scanner.nextInt();
                        switch (d) {
                            case 1:
                                System.out.println("인강만 듣다가 실전부족으로 흑흑... 끝");
                                break;
                            case 2:
                                System.out.println("축하합니다. 하루일과를 무사히 마쳤습니다.");
                                break;
                            case 3:
                                System.out.println("fail");
                                break;
                            case 4:
                                System.out.println("움마이 끝");
                                break;
                        }
                    } else if (c == 2) {
                        System.out.println("느끼해서 배탈이났다. 끝");
                    }

                }
            } else if (a == 2) {
                System.out.println("으악? 끝");
            }

        } else if (input == 2) {
            System.out.println("하루종일 못일어났다..");
        }

        scanner.close();
    }

}
