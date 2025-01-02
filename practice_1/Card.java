package me.Gyojun.practice.practice_1;

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

class MyMath {
    int add(int a, int b) {
        int result = a + b;
        return result;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    long max(long a, long b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    long min(long a, long b) {
        long result = 0;
        if (a < b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

}

class InnerCard {
    public static void main(String[] args) {

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Diamond";
        c2.number = 3;
        Card.width = 1;
        System.out.println(c1.kind);
        System.out.println(c1.number);
        System.out.println(c2.kind);
        System.out.println(c2.number);
        System.out.println(Card.width);
        System.out.println(Card.height);

        MyMath math = new MyMath();
        long i = math.max(12523, 387892);
        long j = math.min(12383223, 2347282);
        System.out.println(i);
        System.out.println(j);
    }

}
