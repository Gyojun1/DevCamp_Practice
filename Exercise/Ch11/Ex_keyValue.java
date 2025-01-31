package me.Gyojun.practice.Exercise.Ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex_keyValue {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};


        HashMap map = new HashMap();


        //중복된 키의 갯수를 카운트해서 값을 초기화해줌
        for(int i=0; i<data.length; i++){
            if(map.containsKey(data[i])){ // 중복이 있을 때
                int value = (int)map.get(data[i]); // map.get(키) = 값이 나오기 때문에 중복체크하기위한 value (키는 중복안되서 카운트로 체크해야함)
                map.put(data[i],value+1);
            } else {
                map.put(data[i],1);
            }
        }

        Iterator it = map.entrySet().iterator();
        
        while (it.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey()+" : "+printBar('#',value)+" "+value);
            
        }

    }

    private static String printBar(char c, int value){
        StringBuilder bar = new StringBuilder();

        for(int i = 0; i<value; i++){
            bar.append(c);
        }
        return bar.toString();


    }


}
