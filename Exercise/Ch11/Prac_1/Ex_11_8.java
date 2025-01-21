package me.Gyojun.practice.Exercise.Ch11.Prac_1;



import java.util.*;


class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total;
    int schoolRank;

    Student() {
    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;

    }


    int getTotal() {
        return kor + eng + math;
    }


    float getAverage() {
        return (float) (Math.round((getTotal() / 3.0) * 10.0) / 10.0);

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
                ", total=" + getTotal() +
                ", average=" + getAverage() +
                ", schoolRank=" + schoolRank +

                '}';
    }

/// //////
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            return s.total - this.total;
        }
        return -1;
    }
 /// //////////////
}

    public class Ex_11_8 {

        public static void calculateSchoolRank(List<Student> list){
            Collections.sort(list);  // 먼저 list를 총점기준 내림차순으로 정렬한다

            int prevRank = -1;
            int prevTotal = -1;
            int length = list.size();



            for (int i=0; i<length; i++){
                Student s = list.get(i);
                if(s.getTotal()!=prevTotal){
                    s.schoolRank = i+1;
                    prevRank = s.schoolRank;
                    prevTotal = s.getTotal();

                } else {

                    s.schoolRank = prevRank ;
                }


            }












        }




        public static void main(String[] args) {




            ArrayList list = new ArrayList();

            list.add(new Student("이자바", 2, 1, 70, 90, 70));
            list.add(new Student("안자바", 2, 2, 60, 100, 80));
            list.add(new Student("홍길동", 1, 3, 100, 100, 100));
            list.add(new Student("남궁성", 1, 4, 90, 70, 80));
            list.add(new Student("김자바", 1, 5, 80, 80, 90));




            calculateSchoolRank(list);

            Iterator it = list.iterator();

            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

}

