package me.Gyojun.practice.Exercise.Ch7;


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {

        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 2 || i == 7) {
                cards[i] = new SutdaCard(i + 1, true);
            } else {
                cards[i] = new SutdaCard(i + 1, false);
            }

        }
        for (int j = 10; j < 20; j++) {
            cards[j] = new SutdaCard(j - 9, false);
        }



    }

    void shuffle(){
        for(int i=0; i<20; i++){
            int k = (int)(Math.random()* cards.length);

            SutdaCard tmp = cards[0];
            cards[0] = cards[k];
            cards[k] = tmp;


        }
    }

    //오버로딩
    SutdaCard pick(int a) {
        return cards[a];
    }
    //오버로딩 - 매개변수 갯수 차이
    SutdaCard pick() {
        int z = (int)(Math.random()*20);
        return cards[z];
    }



}



class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString () {
        return num + (isKwang ? "K":"");
    }




}





class Ex_7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));


    }

}
