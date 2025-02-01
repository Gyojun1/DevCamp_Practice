package me.Gyojun.practice.Exercise.Ch14;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class Ex_14_12 {

    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바",3,300),
                new Student("김자바",1,200),
                new Student("안자바",2,100),
                new Student("박자바",2,150),
                new Student("소자바",1,200),
                new Student("나자바",3,290),
                new Student("감자바",3,180)
        };

        //학생 이름만 뽑아서 List<String>에 저장
        List<String> names = Stream.of(stuArr).map(Student::getName)
                                              .collect(Collectors.toList());
        // 1. stuArr 객체배열을 스트림으로 변환
        // 2. map으로 객체를 객체의 iv 중 하나인 String name으로 변환
        // 3. collect로 다시 List타입으로 변환해서 최종연산? 맞구나
        

        System.out.println(names);

        // 스트림을 배열로 변환
        Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);

        // 배열 출력
        for(Student s : stuArr2)
            System.out.println(s);


        // 스트림을 Map<String, Student>로 변환. 학생 이름이 key
        Map<String,Student> stuMap = Stream.of(stuArr)
                                .collect(Collectors.toMap(s->s.getName(),p->p));
        for(String name : stuMap.keySet())
            System.out.println(name+"-"+stuMap.get(name));

        long count = Stream.of(stuArr).collect(counting());
        long totalScore = Stream.of(stuArr)
                .collect(summingInt(Student::getTotalScore));

        System.out.println("count="+count);
        System.out.println("totalScore="+totalScore);


        totalScore = Stream.of(stuArr)
                .collect(reducing(0, Student::getTotalScore, Integer::sum));
        System.out.println("totalScore="+totalScore);


        Optional<Student> topStudent = Stream.of(stuArr)
                .collect(maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println("topStuent="+topStudent.get());



        IntSummaryStatistics stat = Stream.of(stuArr)
                              .collect(summarizingInt(Student::getTotalScore));
        System.out.println(stat);


        String stuNames = Stream.of(stuArr)
                                .map(Student::getName)
                                .collect(joining(",","{","}"));
        System.out.println(stuNames);

    }

}



class Student implements Comparable<Student>{

    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore){

        this.name= name;
        this.ban = ban;
        this.totalScore = totalScore;
    }



    public String toString(){
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName() { return name;}
    int getBan() {return ban;}
    int getTotalScore() {return totalScore;}

    @Override
    public int compareTo(Student o) {
        return o.totalScore -this.totalScore;
    }



}
















