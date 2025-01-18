package me.Gyojun.practice.Exercise.Ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex_11_2 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(7);

        TreeSet set = new TreeSet(list);

        set.add(1);

        Iterator it  = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
