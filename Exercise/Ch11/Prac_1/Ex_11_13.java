package me.Gyojun.practice.Exercise.Ch11.Prac_1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;


public class Ex_11_13 {
    public static void main(String[] args) throws Exception {
        SutdaDeck deck = new SutdaDeck();

        deck.shuffle();

        Player[] pArr = {
                new Player("타짜",deck.pick(),deck.pick()),
                new Player("고수",deck.pick(),deck.pick()),
                new Player("물주",deck.pick(),deck.pick()),
                new Player("중수",deck.pick(),deck.pick()),
                new Player("하수",deck.pick(),deck.pick())
        };








        TreeMap<Integer,Player> rank = new TreeMap(new Comparator<Integer>() {


            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // 내림차순 정렬
            }
        });

        for (Player player : pArr) {
            int point = deck.getPoint(player); // 점수 계산
            player.point = point; // 점수를 Player 객체에 저장
            rank.put(point, player); // 점수(Key)와 Player(Value) 저장
        }


        for (Integer key : rank.keySet()) {
            Player player = rank.get(key);
            System.out.println("점수: " + key + ", 플레이어: " + player.name);
        }


        // TreeMap 메서드 firstKey()를 이용해서 내림차순 이후 첫번째 1위 정보얻기
        Integer firstKey = (Integer) rank.firstKey();
        Player firstPlayer = (Player) rank.get(firstKey);
        System.out.println("1위는 점수: " + firstKey + ", 플레이어: " + firstPlayer.name);
    }
}



class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    int pos=0;  //다음에 가져올 카드의 위치
    HashMap jokbo = new HashMap();    // 족보를 저장할 HashMap

    SutdaDeck(){
        for(int i=0; i< cards.length; i++){
            int num = i%10+1;
            boolean isKwang = i < 10 && (num==1||num==3||num==8);

            cards[i] = new SutdaCard(num,isKwang);
        }
        registerJokbo(); // 족보를 등록한다.
    }

    // 1. jokbo(HashMap)에 족보를 저장한다.
    // 두 카드의 값을 문자열로 붙여서 key로, 점수를 value로 저장한다.
    void registerJokbo(){
        jokbo.put("KK",4000);
        jokbo.put("1010",3100);   //10을 X로 표현
        jokbo.put("99",3090);
        jokbo.put("88",3080);
        jokbo.put("77",3070);
        jokbo.put("66",3060);
        jokbo.put("55",3050);
        jokbo.put("44",3040);
        jokbo.put("33",3030);
        jokbo.put("22",3020);
        jokbo.put("11",3010);

        jokbo.put("12",2060);
        jokbo.put("21",2060);
        jokbo.put("14",2050);
        jokbo.put("41",2050);
        jokbo.put("19",2040);
        jokbo.put("91",2040);
        jokbo.put("1X",2030);
        jokbo.put("X1",2030);
        jokbo.put("4X",2020);
        jokbo.put("X4",2020);
        jokbo.put("46",2010);
        jokbo.put("64",2010);
    }

    int getPoint(Player p){
        if(p==null) return 0;

        SutdaCard c1 = p.c1;
        SutdaCard c2 = p.c2;

        Integer result = 0;

        // 1. 카드 두 장이 모두 광이면, jokbo에서 키를 "KK"로 해서 점수를 조회한다.
        // 2. 두 카드의 숫자(num)로 jokbo에서 등급을 조회한다.
        // 3. 해당하는 등급이 없으면, 아래의 공식으로 점수를 계산한다.
        //      (c1.num + c2.num) % 10 + 1000
        // 4. Player의 점수 (point)에 계산한 값을 저장한다.

        if(c1.isKwang == true && c2.isKwang == true) {
            result =(int)jokbo.get("KK");
            return result;
        }
        else if (jokbo.containsKey(c1.num+""+c2.num)){
            result = (int)jokbo.get(c1.num+""+c2.num);
            return result;
        }
        else {
            result = (c1.num+c2.num)%10 + 1000;
        }

        return result.intValue();
    }


    SutdaCard pick() throws Exception {
        SutdaCard c = null;

        if(0 <= pos && pos < CARD_NUM){
            c=cards[pos];
            cards[pos++]=null;
        } else{
            throw new Exception("남아있는 카드가 없습니다.");
        }
        return c;
    }

    void shuffle(){
        for(int x=0; x<CARD_NUM*2; x++){
            int i = (int)(Math.random()*CARD_NUM);
            int j = (int)(Math.random()*CARD_NUM);

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;


        }
    }

}       // SutdaDeck


class Player{
    String name;
    SutdaCard c1;
    SutdaCard c2;

    int point;      // 카드의 등급에 따른 점수 - 새로 추가

    Player(String name, SutdaCard c1,SutdaCard c2){
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String toString() {
        return "["+name+"]"+c1.toString() +","+c2.toString();
    }
}       // class Player



class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }

    public String toString() {
        return num+(isKwang ? "K":"");
    }


}























































