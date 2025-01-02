package me.Gyojun.practice.Exercise.Ch6;

public class Ex_6_5 {
    public static void main(String[] args) {

        Student_6_5 s = new Student_6_5("홍길동",1,1,100,60,76);

        System.out.println(s.info());


    }
}


class Student_6_5{

    //생성자를 만든다
    //info() 메서드를 만든다
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student_6_5(String name,int ban,int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;


    }


    String info(){
        return (name+", "+ban+", "+no+", "+kor+", "+eng+", "+math);
    }




}



