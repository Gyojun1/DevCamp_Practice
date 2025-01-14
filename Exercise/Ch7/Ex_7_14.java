package me.Gyojun.practice.Exercise.Ch7;




class SutdaCard1 {
    final int num;
    final boolean isKwang;

    SutdaCard1(){
        this(1,true);
    }

    SutdaCard1(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString () {
        return num + (isKwang ? "K":"");
    }




}



public class Ex_7_14 {

    public static void main(String[] args) {
        SutdaCard1[] Sc = new SutdaCard1[20];

        for(int i=0; i<Sc.length/2; i++){
            if (i==0 || i==2 || i==7){
                Sc[i] = new SutdaCard1(i+1,true);
            } else {
                Sc[i] = new SutdaCard1(i+1,false);
            }
        }

        for(int i=10; i<Sc.length; i++){
            Sc[i] = new SutdaCard1(i-9,false);
        }

        for (SutdaCard1 card : Sc){
            System.out.println(card);
        }




    }

}
