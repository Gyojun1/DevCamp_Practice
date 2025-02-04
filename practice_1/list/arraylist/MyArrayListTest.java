package me.Gyojun.practice.practice_1.list.arraylist;

public class MyArrayListTest {

    public static void main(String[] args) {


        MyArrayList array = new MyArrayList();
        array.addElement(10);
        array.addElement(20);
        array.addElement(20);

        array.insertElement(1,50);
        array.printAll();



    }



}
