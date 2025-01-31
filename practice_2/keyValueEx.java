package me.Gyojun.practice.practice_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class keyValueEx {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

        HashMap map = new HashMap();

        //키
        for(int i=0; i<data.length; i++){
            if(map.containsKey(data[i])){   //map은 키값이 중복 안되기 때문에
                int value = (int)map.get(data[i]); // 겹치는 거 있을 때 카운트를 value로 하기
                map.put(data[i],value+1);
            } else {
                map.put(data[i],1);     // 키는 중복이 안되기 때문에 값만 업데이트 되는건가?
            }
        }
        // [A,1] , [K,1]

        Iterator it = map.entrySet().iterator(); // 키와 값을 동시에 구하기위한

        while(it.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey()+" : "+printBar('#',value)+" "+value);

        }
    }

    private static String printBar(char c, int value) {
        StringBuffer bar = new StringBuffer();
        for (int i = 0; i < value; i++) {
            bar.append(c); // 문자를 value 번 반복하여 추가
        }
        return bar.toString(); // 문자열로 반환
    }

}
