package me.Gyojun.practice.Exercise.Ch11;

import java.util.*;


class Student1 implements Comparable<Student1> {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    Student1(){}

    Student1(   String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }


    int getTotal(){
        return kor+eng+math;
    }


    float getAverage(){
        return (float)(Math.round((getTotal()/3.0) * 10.0)/10.0);

    }



    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }


    @Override
    public int compareTo(Student1 o) {
        return this.name.compareTo(o.name);
    }
}


public class Ex_11_6 {

    static int getGroupCount(TreeSet<Student1> tset, int from, int to) {
        int count = 0;
        Iterator<Student1> it = tset.iterator();


        // while문 it가 가지고 있을 때
        while (it.hasNext()) {
            float average = it.next().getAverage();
            // it.next() -> Student1 => it.next().getAverage()가 60이상 70미만일 때
            if (average >= from && average <= to)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {


        TreeSet set = new TreeSet(new Comparator() {
//            TreeSet set = new TreeSet(new Comparator<Student1>() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student1 && o2 instanceof Student1) {

                    Student1 tmp = (Student1) o1;
                    Student1 tmp2 = (Student1) o2;        //

                        return  tmp2.no - tmp.no;

                }

                return -1;
            }
        });


        set.add(new Student1("홍길동",1,1,100,100,100));
        set.add(new Student1("남궁성",1,2,90,70,80));
        set.add(new Student1("김자바",1,3,80,80,90));
        set.add(new Student1("이자바",1,4,70,90,70));



        Iterator it = set.iterator();

        while (it.hasNext())
            System.out.println(it.next());



        System.out.println("[60~69] :"+getGroupCount(set,60,70));
        System.out.println("[70~79] :"+getGroupCount(set, 70,80));
        System.out.println("[80~89] :"+getGroupCount(set,80,90));
        System.out.println("[90~100] :"+getGroupCount(set,90,101));


    }

}

