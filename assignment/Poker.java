package me.Gyojun.practice.assignment;

import java.util.*;

public class Poker {

    static ArrayList<Player> playerInfo = new ArrayList<>();  // 플레이어 객체 저장 ArrayList
    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {

        Dealer.registerJokbo();


        while(true) {
            switch (displayMenu()){
                case 1 :
                    addPlayer();
                    break;
                case 2 :
                    runGames();
                    break;
                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
            }
        }
    }

    static void runGames() {

        // 플레이어 수가 모자랄 때 예외처리
        if(playerInfo.size() < 2){
            System.out.println("최소 2명이상의 플레이어가 필요합니다.");
            return;
        }

        System.out.println("=================== 100판을 자동 진행합니다. ===================");

        for (int i = 0; i < 100; i++) {
            // 1) 매 라운드마다 Deck 초기화 및 셔플
            Deck deck = new Deck();
            deck.shuffle();

            //한 라운드에 단 한번의 라운드 숫자 표시를 위한
            System.out.println("Round " + (i + 1));


            // 2) 카드 분배
            for (int j = 0; j < playerInfo.size(); j++) {
                playerInfo.get(j).playerCards = deck.dealCards();
            }



            // 3) 각 플레이어 핸드 평가 후, Player별 랭크를 저장할 Map
            Map<Player, Integer> playerRankMap = new HashMap<>();

            // 4) 딜러를 통해 핸드를 평가하고, 각 플레이어의 카드 & 랭크 출력
            for (int j = 0; j < playerInfo.size(); j++) {
                Player p = playerInfo.get(j);
                Dealer dealer = new Dealer();

                // 핸드 타입(족보명) & 랭크 계산
                String playerHands = dealer.evaluate(p.playerCards);    // 카드의 랭크를 String으로 초기화
                int rankValue = Dealer.getRank(playerHands);    // String 타입의 카드랭크를 키값으로 int 밸류값을 불러와서 int rankValue에 초기화
                playerRankMap.put(p, rankValue);    // 플레이어 객체와 int 카드랭크값을 Map<Player, Integer> playerRankMap 에 저장 (승자를 구분하기위함)



                // 라운드별 정보 출력
                System.out.println(p.name + "의 카드: " + Arrays.toString(p.playerCards) +"    족보: " + playerHands + " (랭크: " + rankValue + ")");
            }

            // 5) 이번 라운드 최고 랭크 찾기 + 무승부 처리
            int highestRank = Collections.max(playerRankMap.values());
            int drawCount = 0;  //highestRank를 가진 사람이 둘 이상이면 무승부 처리

            // 6) 승패 업데이트
            for (int j = 0; j < playerInfo.size(); j++) {
                Player p = playerInfo.get(j);
                int currentRank = playerRankMap.get(p);

                if (currentRank == highestRank) {       // drawCount가 2이상이면 높은 랭크 플레이어 무승부 처리
                    drawCount++;
                }
            }
            // 승, 패, 무승부까지 처리
            for (int j = 0; j < playerInfo.size(); j++) {
                Player p = playerInfo.get(j);
                int currentRank = playerRankMap.get(p);

                if (currentRank == highestRank && drawCount >= 2) {
                    p.draw++;
                    System.out.println(p.name + " 무승부");
                } else if (currentRank == highestRank) {
                    p.money += 100;
                    p.win++;
                    System.out.println(p.name + " 승리");
                }else {
                    p.lose++;
                    System.out.println( p.name + " 패배");
                }
            }

            System.out.println("=============================================");

        }

        System.out.println("=== 자동 진행이 종료되었습니다. ===\n");

        // 최종 결과 출력
        showFinalResults();
        System.exit(0); // 종료
    }

    static void showFinalResults() {
        System.out.println("\n=============== 최종 결과 ===============");
        for (int j = 0; j < playerInfo.size(); j++) {
            System.out.println(playerInfo.get(j));
        }
        System.out.println("========================================\n");
    }



    static int displayMenu(){

        System.out.println("****************************************************************");
        System.out.println("*                          Poker game                          *");
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println("1. 플레이어 추가하기(최대 4명)");
        System.out.println("2. 게임시작");
        System.out.println("3. 프로그램 종료");
        System.out.println();
        System.out.println("원하는 메뉴를 선택하세요. (1~3) : ");

        int menu = 0;

        while(true){
            try{
                menu = s.nextInt();
                s.nextLine(); // 잘못된 입력이 발생했을 때도 버퍼 비우기
                break;
            } catch (Exception e){
                System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
                s.nextLine(); // 잘못된 입력이 발생했을 때도 버퍼 비우기
            }
        }
        return menu;
    }

    // 플레이어 추가
    static void addPlayer(){


        System.out.println("플레이어 이름을 입력하세요. (1~20자 사이로 입력해야하며 중복이 불가합니다.)");
        String inputPlayer = s.nextLine();

        // 최대 4명 제한
        if(playerInfo.size()>=4){
            System.out.println("최대 4명의 플레이어만 참가할 수 있습니다.");
            return;
        }

        // 플레이어 닉네임 중복제거
        for(int i=0; i<playerInfo.size(); i++){
            if (inputPlayer.equals(playerInfo.get(i).name)){
                System.out.println("플레이어 이름이 중복되었습니다. 다시 입력해주세요.");
                addPlayer();
                return;
            }
        }

        // 빈칸일 때 처리
        if(inputPlayer.isEmpty()){
            System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
            addPlayer();
        }

        //글자 수 20자 초과 시 처리
        if (inputPlayer.length() > 20) {
            System.out.println("글자 수가 초과하였습니다. 다시 입력해주세요.");
            addPlayer();
            return;
        }

        //
        playerInfo.add(new Player(inputPlayer));    // addPlayer - 플레이어 객체 생성
        System.out.println("현재 등록된 플레이어 수는 "+playerInfo.size()+"명 입니다.");

        // 람다식으로 현재 플레이어 이름 출력
        playerInfo.forEach(player -> System.out.println(player.name));

//        // 일반 for문
//        for(int i=0; i<playerInfo.size(); i++){
//            System.out.println(playerInfo.get(i).name);
//        }
//        // 향상된 for문
//        for (Player value : playerInfo) {
//            System.out.println(value.name);
//        }


    }
}





class Deck  {

    static final int CARD_NUM = 52;
    Card[] deck = new Card[CARD_NUM];

    int currentIndex = 0;

    Deck(){

        int k=0;
        for(int i=0; i<Card.KIND_MAX; i++)
            for(int j=0; j<Card.NUM_MAX; j++){

                deck[k++]= new Card(i,j+1);
            }
    }


    void shuffle(){

        for(int i=0; i<deck.length; i++){

            int j = (int)(Math.random()*CARD_NUM);

            Card tmp = deck[i];
            deck[i] = deck[j];
            deck[j] = tmp;
        }
    }


    // 카드 나눠주기 덱 다 쓰면 다시 리필해줘야하는 것도 추후 추가하기 - 매 라운드 리필로 변경
    Card[] dealCards() {
        Card[] tmp = new Card[5];
        for (int i = 0; i < 5; i++) {
            tmp[i] = deck[currentIndex++];
        }
        return tmp;
    }



}





// Card 클래스
class Card {

    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 0;
    static final int DIAMOND = 1;
    static final int HEART = 2;
    static final int CLOVER = 3;


    int kind;
    int number;


    Card(int kind,int number){
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        String[] kinds = {"SPADE", "DIAMOND","HEART","CLOVER" };
        String numbers = "0A23456789XJQK" ; // 10은 X로 표현

        return "("
                 + kinds[this.kind] +
                "," + numbers.charAt(this.number) +
                ')';
    }
}

class Player {

    String name ;
    int money;
    int win;
    int lose;
    int draw;
    Card[] playerCards = new Card[5];


    Player(String name){
        this.name=name;
        this.money=10000;
        this.win=0;
        this.lose=0;
    }

    @Override
    public String toString() {
        return  "플레이어 이름 : '" + name +'\'' +
                ", money :" + money +
                ", win :" + win +
                ", lose :" + lose+
                ", draw :" + draw
                ;
    }
}




class Dealer{


    int pairCount;



    public String evaluate(Card[] hand) {
        pairCount = 0;
        // pairCount를 초기화 시키기
        // pairCount로 포카드 풀하우스 트리플 투페어 원페어까지 구분 가능함
        {
            for (int i = 0; i < 5; i++) {
                for (int j = 4; j > i; j--) {
                    if (hand[i].number == hand[j].number) {
                        pairCount++;
                    }
                }
            }
        }




        if (royalFlush(hand)){
            return "로얄플러쉬";
        }

        if (straitFlush(hand)){
            return "스트레이트플러쉬";
        }

        if (fourCard(hand)){
            return "포카드";
        }

        if (fullHouse(hand)){
            return "풀하우스";
        }
        if (flush(hand)){
            return "플러쉬";
        }

        if (straight(hand)){
            return "스트레이트";
        }

        if (threeCard(hand)){
            return "트리플";
        }

        if (isTwopair(hand)){
            return "투페어";
        }

        if (isOnepair(hand)){
            return "원페어";
        }
        return "하이카드";




    }

    boolean royalFlush(Card[] hand) {

        int[] numbers = new int[5];
        int[] a = {1,10,11,12,13};

        for(int i=0; i<5; i++){
            numbers[i] = hand[i].number;
        }
        Arrays.sort(numbers);

        if(hand[0].kind == hand[1].kind && hand[0].kind == hand[2].kind && hand[0].kind == hand[3].kind && hand[0].kind == hand[4].kind ){
            return Arrays.equals(numbers, a);
        }
        return false;
    }

    boolean straitFlush(Card[] hand) {
        int[] numbers = new int[hand.length];

        // 각 카드의 숫자를 배열에 저장
        for (int i = 0; i < hand.length; i++) {
            numbers[i] = hand[i].number;
        }

        // 숫자를 오름차순으로 정렬
        Arrays.sort(numbers);

        // 연속된 숫자인지 확인

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1] + 1) { // 연속된 숫자가 아니면 스트레이트 아님
                return false;
            }
        }
        if(!(hand[0].kind == hand[1].kind && hand[0].kind == hand[2].kind && hand[0].kind == hand[3].kind && hand[0].kind == hand[4].kind )) {
            return false;
        }
        return true;
    }

    boolean fourCard(Card[] hand) {
        return pairCount == 6;
    }

    boolean fullHouse(Card[] hand) {
        return pairCount == 4;
    }

    boolean flush(Card[] hand) {
        return hand[0].kind == hand[1].kind && hand[0].kind == hand[2].kind && hand[0].kind == hand[3].kind && hand[0].kind == hand[4].kind;
    }


    // 스트레이트
    boolean straight(Card[] hand) {

        int[] numbers = new int[hand.length];

        // 각 카드의 숫자를 배열에 저장
        for (int i = 0; i < hand.length; i++) {
            numbers[i] = hand[i].number;
        }

        // 숫자를 오름차순으로 정렬
        Arrays.sort(numbers);

        // 연속된 숫자인지 확인
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1] + 1) { // 연속된 숫자가 아니면 스트레이트 아님
                return false;
            }
        }
        return true; // 연속된 숫자라면 스트레이트
    }

    boolean threeCard(Card[] hand) {
        return pairCount == 3;
    }

    boolean isTwopair(Card[] hand) {
        return pairCount == 2;
    }

    boolean isOnepair(Card[] hand){
        return pairCount == 1;
    }


    static HashMap<String,Integer> jokbo = new HashMap<>();

    // 여기는 족보만 올리게하고 따로 랭크를 비교해서 v값으로 k를 출력할 수 있도록 세팅
    static void registerJokbo() {
        jokbo.put("하이카드", 0);
        jokbo.put("원페어", 1);
        jokbo.put("투페어", 2);
        jokbo.put("트리플", 3);
        jokbo.put("스트레이트", 4);
        jokbo.put("플러쉬", 5);
        jokbo.put("풀하우스", 6);
        jokbo.put("포카드", 7);
        jokbo.put("스트레이트플러쉬", 8);
        jokbo.put("로얄플러쉬", 9);
    }


    public static int getRank(String key) {
        return jokbo.get(key);
    }




}




