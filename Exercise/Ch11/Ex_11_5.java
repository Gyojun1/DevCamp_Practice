package me.Gyojun.practice.Exercise.Ch11;

import java.util.*;


class Student0 implements Comparable<Student0> {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    Student0() {
    }

    Student0(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }


    int getTotal() {
        return kor + eng + math;
    }


    float getAverage() {
        return (float) (Math.round((getTotal() / 3.0) * 10.0) / 10.0);

    }


    @Override
    public String toString() {
        return "Student0{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }


    @Override
    public int compareTo(Student0 o) {
        return this.name.compareTo(o.name);
//    }
    }
    
}


public class Ex_11_5 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new Student0("홍길동", 1, 1, 100, 100, 100));
        list.add(new Student0("남궁성", 1, 2, 90, 70, 80));
        list.add(new Student0("김자바", 1, 3, 80, 80, 90));
        list.add(new Student0("이자바", 1, 4, 70, 90, 70));
        list.add(new Student0("안자바", 1, 5, 60, 100, 80));


        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }

}