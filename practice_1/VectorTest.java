package me.Gyojun.practice.practice_1;


import java.util.Arrays;

class MyVector {

    //Object배열 objArr을 인스턴스 변수로 갖는 MyVector클래스를 선언하시오
    //MyVector클래스에 생성자 MyVector(int capacity)와 기본 생성자(capacity=16)을 추가하시오
    //MyVector클래스에 객체배열에 저장된 객체의 개수를 저장하기위한 인스턴스 변수 size를 추가하고, 이 변수의 값을 반환하는 size()와
    //      배열 objArr의 길이를 반환하는 capacity(), 그리고 객체배열이 비었는지 확인하는 boolean isEmpty()를 작성하시오
    //MyVector클래스의 객체배열 objArr에 객체를 추가하는 메서드 void add(Object obj)를 작성하시오
    //MyVector클래스의 객체배열 objArr에 저장된 객체를 반환하는 Object get(index)를 작성하시오
    //MyVector클래스의 객체배열 objArr에 저장된 모든 객체를 문자열로 이어서 반환하도록 toString()을 오버라이딩하시오
    //MyVector클래스의 객체배열 objArr에서 지정된 객체가 저장되어 있는 위치(index)를 반환하는 int indexOf(Object obj)를 작성하시오.
    //MyVector클래스의 객체배열 objArr에서 지정된 객체를 삭제하는 boolean remove(Object obj)를 작성하시오. - indexOf()를 이용

    Object[] objArr;
    int size;
    private Object obj;

    MyVector(int capacity){
        this.objArr = new Object[capacity];
        size = 0;
    }

    MyVector(){
        this(16);
    }

    int size(){
        return size;
    }

    int capacity(){
        return objArr.length;
    }

    boolean isEmpty(){
        if (size==0){
            return true;
        }else {
            return false;
        }

    }

    void add(Object obj){

        // size가 배열길이만큼 꽉 찼으면 배열을 2배 크게 새로 생성해서 복사하고 add하기

        if (size == capacity()){

            Object[] tmp = new Object[objArr.length*2];

            System.arraycopy(objArr,0,tmp,0,objArr.length);

            objArr=tmp;
            objArr[size++] = obj;

        } else {

            objArr[size++] = obj;

        }
    }

    Object get(int index){

        if (index >=0 && index < objArr.length){
            return objArr[index];
        } else {
            return -1;
        }

    }

    // 중복값이 있어도 하나만 리턴함
    int indexOf(Object obj){

        for(int i=0; i< objArr.length; i++){
            if (objArr[i]==obj){
                return i;
            }
        }

        return -1; // 일치하지않음
    }

    boolean remove(Object obj){

        //새로운 배열을 생성해서 remove 한부분을 제외하고 copy 하기
        // clone() 써보기
        //그리고 마지막에 size-- 해주기 - 하나 뺏으니까
        int idx = indexOf(obj);
        // 배열 복제
        Object[] tmp = objArr.clone();

        // 복제한 배열에서 해당 객체를 제외하고 복사
        for (int i = idx; i < size - 1; i++) {
            tmp[i] = tmp[i + 1];
        }

        // 마지막 요소는 null로 설정
        tmp[size - 1] = null;

        // objArr와 size 업데이트
        objArr = tmp;
        size--;

        return true; // 삭제 성공

    }




    @Override
    public String toString() {
        return "objArr=" + Arrays.toString(objArr) +
                " size=" + size;
    }


}



 public class VectorTest {


    public static void main(String[] args) {

        MyVector v = new MyVector();

        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("5");
        v.add("6");
        v.add("7");
        v.add("8");
        v.add("9");
        v.add("10");
        v.add("11");
        v.add("12");
        v.add("13");
        v.add("14");
        v.add("15");
        v.add("16");
        v.add("17");


        System.out.println(v);



//        v.indexOf("5");
//        System.out.println(v.indexOf("5"));


        v.remove("8");
        System.out.println(v);
        v.remove("4");
        System.out.println(v);

    }
}
