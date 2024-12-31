package me.Gyojun.practice.Exercise.Ch3;

public class Ex_3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (float)5/9 *(float)(fahrenheit-32);  // Math.round() 쓰지 않고 3번째에서 반올림?

        //C =5/9 * (F-32)

        System.out.println("Fashrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);

    }
}
