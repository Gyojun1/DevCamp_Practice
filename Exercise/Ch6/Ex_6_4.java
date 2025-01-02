package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_4 {

    public static void main(String[] args) {
        Student00 s = new Student00();
        s.name = " 홍길동" ;
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System. out . println( " 이름: " +s.name ) ;
        System. out . println( " 총점: " +s.getTotal()) ;
        System. out . println( " 평균: " +s.getAverage()) ;
    }
}

class Student00 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int sum;
    float average;

    int getTotal(){
        sum = kor+eng+math;
        return sum;
    }

    float getAverage(){
        average = (float)(Math.round((sum/3.0) * 10.0)/10.0);
        return average;
    }


}





