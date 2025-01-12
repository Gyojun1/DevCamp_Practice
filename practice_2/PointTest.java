package me.Gyojun.practice.practice_2;


import java.util.Arrays;
import java.util.Objects;

class Point{
    int x;
    int y;

    Point(){
        this(1,1);
    }

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    static double getDistance(Point p1,Point p2){

        return Math.sqrt(Math.abs(Math.pow(p1.x - p2.x, 2)) + Math.abs(Math.pow(p1.y - p2.y, 2)));
    }

    double getDistance(Point p){

        return Math.sqrt(Math.abs(Math.pow(this.x - p.x, 2)) + Math.abs(Math.pow(this.y - p.y, 2)));
    }



    @Override
    public String toString (){

        return "x="+x+", y="+y;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj; // 타입 캐스팅
            return p.x == this.x && p.y == this.y; // 필드 값 비교
        }
         return false;
    }


}


class Point3D extends Point{

    int z;




    Point3D(int x, int y, int z){
        super(x,y);
        this.z=z;
    }

    Point3D(){
        this(1,1,1);
    }


    @Override
    public String toString (){
        return "x="+x+", y="+y+", z="+z;
    }


}

class MyVector{

    Object[] objArr;
    int size;


    MyVector(int capacity){
        this.objArr= new Object[capacity];
        this.size=0;
    }


    MyVector(){
        this(16);
        this.size=0;
    }


    int size(){
        return size;
    }

    int capacity(){
        return objArr.length;
    }

    boolean isEmpty(){
        return size==0;
    }



    // 왜 안되는걸까?
    void add(Object obj){
        if (size==objArr.length){
            System.out.println("저장공간이 부족합니다.");
        } else {
            objArr[size++] = obj;
        }


    }


    @Override
    public String toString (){
        return Arrays.toString(objArr);
    }


    Object get(int index){
        if(index>=0 && index<objArr.length){
            return objArr[index];
        } else {
            return -1;
        }
    }


    int indexOf(Object obj){

        for(int i=0; i<objArr.length; i++){
            if(obj.equals(objArr[i])) {
                return i;
            }
        }

        return -1;
    }


    boolean remove(Object obj){

        if (indexOf(obj) == -1){
            return false;
        }

        Object[] objArr2 = new Object[objArr.length];

        int idx = indexOf(obj);

        System.arraycopy(objArr,0,objArr2,0,idx);
        System.arraycopy(objArr,idx+1,objArr2,idx,size-idx);
        objArr2[size-1] = null;
        this.size--;
        objArr=objArr2;

        return true;

    }


}






public class PointTest {

    public static void main(String[] args) {

        Point p = new Point(3,5);
        Point p1 = new Point();

        System.out.println(p);
        System.out.println(p1);

        MyVector Mv = new MyVector();

        Mv.add("1");
        Mv.add("2");
        Mv.add("3");
        Mv.add("4");
        Mv.add("5");
        Mv.add("6");
        Mv.add("7");
        Mv.add("8");
        Mv.add("9");
        Mv.add("10");


//        System.out.println(Mv.size);
//        System.out.println(Mv.isEmpty());
//
        System.out.println(Mv);
        Mv.remove("3");
        System.out.println(Mv);
        Mv.remove("8");
        System.out.println(Mv);


//        System.out.println(Mv.get(-999));
//        System.out.println(Mv.indexOf("3"));





    }

}
