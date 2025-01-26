package main.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map은 key와 value를 쌍으로 저장하는 자료구조 키는 중복될 수 없고, 값은 중복될 수 있다.
public class MapExam {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "choi");

        map.put("001", "kang");

        System.out.println(map.size());

        System.out.println(map.get("001"));

        Set<String> keys = map.keySet();// key만 꺼내어 확인가능
        //key만 set에 들어있다

        Iterator<String> iter = keys.iterator();

        while(iter.hasNext()){
            String key = iter.next();

            String value = map.get(key);
            System.out.println(key + value);
        }


    }
}
