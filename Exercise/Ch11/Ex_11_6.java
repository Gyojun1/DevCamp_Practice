package me.Gyojun.practice.Exercise.Ch11;

import java.util.*;


class Student implements Comparable<Student> {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    Student(){}

    Student(   String name, int ban, int no, int kor, int eng, int math) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}


public class Ex_11_6 {

    static int getGroupCount(TreeSet<Student> tset, int from, int to) {
        int count = 0;
        Iterator<Student> it = tset.iterator();


        // while문 it가 가지고 있을 때
        while (it.hasNext()) {
            float average = it.next().getAverage();
            // it.next() -> Student => it.next().getAverage()가 60이상 70미만일 때
            if (average >= from && average <= to)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {


        TreeSet set = new TreeSet(new Comparator() {
//            TreeSet set = new TreeSet(new Comparator<Student>() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student) {

                        Student tmp = (Student) o1;
                        Student tmp2 = (Student) o2;        //

                        return  tmp2.no - tmp.no;

                }

                return -1;
            }
        });


        set.add(new Student("홍길동",1,1,100,100,100));
        set.add(new Student("남궁성",1,2,90,70,80));
        set.add(new Student("김자바",1,3,80,80,90));
        set.add(new Student("이자바",1,4,70,90,70));



        Iterator it = set.iterator();

        while (it.hasNext())
            System.out.println(it.next());



        System.out.println("[60~69] :"+getGroupCount(set,60,70));
        System.out.println("[70~79] :"+getGroupCount(set, 70,80));
        System.out.println("[80~89] :"+getGroupCount(set,80,90));
        System.out.println("[90~100] :"+getGroupCount(set,90,101));


    }

}
