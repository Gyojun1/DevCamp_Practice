package me.Gyojun.practice.practice_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeyValueTest {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

        HashMap map = new HashMap();


        // Key
        for(int i=0;i<data.length; i++){
            if(map.containsKey(data[i])){
                int value = (int)map.get(data[i]);
                map.put(data[i],value+1);
            } else {
                map.put(data[i],1);
            }
        }

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey()+" : "+printBar('#',value)+value);


        }
    }

    private static String printBar(char c, int value){
        StringBuilder bar = new StringBuilder();
        for(int i=0; i<value; i++){
            bar.append(c);
        }
        return bar.toString();

    }



}
