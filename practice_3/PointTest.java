package me.Gyojun.practice.practice_3;


import java.util.Arrays;

class Point {
    int x;
    int y;

    Point(){
        this(1,1);
    }

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }


    double getDistance(Point p1, Point p2){

        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    }

    double getDistance(Point p1) {
        return Math.sqrt(Math.pow(p1.x-this.x,2)+Math.pow(p1.y-this.y,2));
    }



    @Override
    public String toString(){

        return "x="+x+"y="+y;
    }


    @Override
    public boolean equals(Object obj){
        if(obj instanceof Point){
            Point p = (Point)obj;
            return this.x==p.x && this.y==p.y;
        }

        return false;
    }
}

class Point3D extends Point{
    int z;

    Point3D(){
        this(1,1,1);
    }

    Point3D(int x, int y, int z){
        super(x,y);
        this.z=z;

    }

    public String toString(){

        return "x="+x+"y="+y+"z="+z;
    }


}

class MyVector{

    Object[] objArr;
    int size;


    MyVector(){
        this(16);
    }

    MyVector(int capacity){
        this.objArr = new Object[capacity];
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

    void add(Object obj){
        if(size == objArr.length){
            System.out.println("저장공간이 부족합니다. 배열의 capacity를 2배로 늘려줍니다.");

            Object[] tmp = new Object[objArr.length*2]; // 왜 new를 붙여줘야할까? 배열도 객체이기 때문

            System.arraycopy(objArr,0,tmp,0,objArr.length);

            objArr = tmp;

            objArr[size++] = obj;
        }else {
            objArr[size++] = obj;
        }
    }

    Object get(int index){
        if(index>=0 && index< objArr.length){
            return this.objArr[index];
        }
        return -1;
    }



    int indexOf(Object obj){
        for(int i = 0; i<objArr.length; i++){
            if(obj.equals(objArr[i])){
                return i;
            }
        }
        return -1;

    }

    // 배열을 제거할 인덱스위치를 제외하고 복사한다.
    // 다시 참조변수를 바꾼다.
    // 하나 제거했으므로 size--

    boolean remove(Object obj){

        Object[] tmp = new Object[objArr.length];

        int idx =indexOf(obj);
        if(idx == -1){
            return false;
        }

        System.arraycopy(objArr,0,tmp,0,idx);
        System.arraycopy(objArr,idx+1,tmp,idx,size-idx);


        size--;
        objArr=tmp;

        return true;
    }



    @Override
    public String toString() {
        return "MyVector{" +
                "objArr=" + Arrays.toString(objArr) +
                ", size=" + size +
                '}';
    }
}



public class PointTest {

    public static void main(String[] args) {
        Point p = new Point();
        Point p1 = new Point(3,5);


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
        v.remove("13");
//        System.out.println(v.get(5));

        System.out.println(v);

    }

}
