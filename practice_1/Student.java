package me.Gyojun.practice.practice_1;

import java.util.Arrays;

class MyParents1 {  // 상속을 시켜볼 클래스 만든거
    String address;
    int tel;

    // 부모 클래스의 메서드  오버라이딩 시킬 메서드
    int getLocation() {
        System.out.println("부모 클래스: 전화번호는 " + tel);
        return tel;
    }
}

class MyParents2 {          // 포함을 시켜볼 클래스 임의로 만듬
    String hobby = "농구";
    }



public class Student extends MyParents1 {

    String name;
    int age;
    char grade;

    static String schoolName = "DevCamp";


    // MyParents2를 포함으로 iv를 사용하기 위한 객체생성
    MyParents2 h = new MyParents2();

    //    void setHobby(String hobby){
//        h.hobby = hobby;
//    }
    // 부모 클래스의 메서드를 오버라이딩
    @Override
    int getLocation() {
        System.out.println("자식 클래스: 학생 이름은 " + name + " / 전화번호는 " + tel);
        return tel;
    }

    public Student(String name, int age, char grade, String address, String hobby) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.address = address;
        h.hobby= hobby;

    }

    @Override
    public String toString() {
        return name+age+grade+address; //  String 타입으로 리턴을 한다
    }

    // 학생들의 정보나열 메서드
    void displayInfo() {
        System.out.println("학교이름 : " + schoolName + "  /  이름 : " + name + "  /  나이 : " + age + "  /  성적 : " + grade + "  /  학교주소 : " + address+ "  /  취미 : " + h.hobby);
    }

    // 학교이름을 바꾸는 static 메서드 (cv + lv 사용)
    static void schoolNameChange(String a) {
        schoolName = a;

    }

    // 학교이름 정보를 불러오는 static 메서드
    static void schoolNameInfo() {
        System.out.println("학교이름 : " + schoolName);
    }


}

class MyOverriding {
    int x;
    int y;

    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}


class StudentMain {
    public static void main(String[] args) {

        //static 메서드 객체생성 없이 사용가능
        Student.schoolNameInfo();

        //
        //        Student student2 = new Student("최회진",19,'A');
        //        Student student3 = new Student("유창호",18,'C');
        //        Student student4 = new Student("문지환",18,'B');
        //        Student student5 = new Student("김우주",17,'C');
        //        Student student6 = new Student("김예린",19,'B');
        //        Student student7 = new Student("김나현",17,'B');
        //        Student student8 = new Student("이민형",18,'C');
        //        Student student9 = new Student("양재영",17,'C');


        //객체 배열 생성 및 초기화   ( 위의 방법보다 좋은점 - 참조변수의 값을 전부 지정할 필요가없음 그러면 불러올 때 배열 숫자로? 하겠네)
        Student[] students = {
                new Student("장교준", 19, 'A', "강남역 4번출구", "독서"),
                new Student("최회진", 19, 'A', "강남역 4번출구", "독서"),
                new Student("유창호", 18, 'C', "강남역 4번출구", "독서"),
                new Student("문지환", 18, 'B', "강남역 4번출구", "독서"),
                new Student("김우주", 17, 'C', "강남역 4번출구", "독서"),
                new Student("김예린", 19, 'B', "강남역 4번출구", "독서"),
                new Student("김나현", 17, 'B', "강남역 4번출구", "독서"),
                new Student("이민형", 18, 'C', "강남역 4번출구", "독서"),
                new Student("오슬기", 19, 'A', "강남역 4번출구", "독서"),
                new Student("양재영", 17, 'C', "강남역 4번출구", "독서")
        };
        System.out.println(students[0].toString());

        // 학생정보 조회
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }

        // Student 객체 생성
        Student student = new Student("장교준", 19, 'A', "강남역 4번출구", "농구");
        student.tel = 123456789;

        // 부모 클래스 메서드 호출 (오버라이딩 적용 확인)
        student.getLocation();



        // for문으로 객체배열 일괄조회 가능 (+ 커스텀하여서 A grade인 학생의 정보만 가져올 수 있도록)
//        for(int i=0; i<students.length; i++) {
//            if(students[i].grade == 'A') {
//                students[i].displayInfo();
//            }
//        }


        //학교이름 바꾸기 메서드 (lv+cv)
        Student.schoolNameChange("패스트캠퍼스");
        Student.schoolNameInfo();
        students[0].displayInfo();


        MyOverriding over = new MyOverriding();
        over.x = 1;
        over.y = 2;
        System.out.println(over.toString());



}

    }

