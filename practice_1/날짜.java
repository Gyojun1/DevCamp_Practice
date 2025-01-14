package me.Gyojun.practice.practice_1;

import java.util.Calendar;
import java.util.Date;

public class 날짜 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2024,1,31);
        Date d2 = new Date(cal.getTimeInMillis());
        System.out.println("cal : "+d2);

    }
}
