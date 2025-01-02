package me.Gyojun.practice.practice_1;

class StudentDB {

    int age;
    String name;
    static String schoolName = "DevCamp";

    // 생성자
    public StudentDB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 인스턴스 메서드
    void displayInfo() {
        System.out.println("학교 - " + schoolName + " / 이름 - " + name + " / 나이 - " + age);
    }

    // 인스턴스 메서드 - 특정 나이 서칭
    void lookUpAge(int targetAge) {
        if (age == targetAge) {
            System.out.println("나이가 " + targetAge + "이고 이름이 " + name + "인 학생을 찾았습니다.");
        } else {
            System.out.println("해당 나이에 맞는 학생이 없습니다.");
        }
    }

    // static 메서드
    static void updateSchoolName() {
        schoolName = "패스트캠퍼스";
    }

}

class StudentDBMain {

    public static void main(String[] args) {

        // 객체 생성
        StudentDB student1 = new StudentDB("장교준", 19);
        StudentDB student2 = new StudentDB("최회진", 18);
        StudentDB student3 = new StudentDB("유창호", 19);
        StudentDB student4 = new StudentDB("문지환", 17);
        StudentDB student5 = new StudentDB("김우주", 17);
        StudentDB student6 = new StudentDB("오슬기", 18);
        // 학생 정보출력
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();

        // 학교이름 업데이트

        StudentDB.updateSchoolName();
        student1.displayInfo();
        student6.displayInfo();

        // 나이로 찾기 (인스턴스 메서드를 사용하기위한 객체생성)
        student1.lookUpAge(17);
        student2.lookUpAge(17);
        student3.lookUpAge(17);
        student4.lookUpAge(17);
        student5.lookUpAge(17);
        student6.lookUpAge(17);
    }
}
