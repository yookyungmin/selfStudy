package main.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class Hash1 {
    public static void main(String[] args) {

        Map<String, Object> hashMap = new HashMap();


        //데이터 넣어줌
        hashMap.put("num", 1);
        hashMap.put("name", "rios");
        hashMap.put("email", "rios0812@naver.com");
        hashMap.put("phone_num", "010-1234-1234");


        // ** value를 통해 key 값얻기 **

        System.out.println(getKey(hashMap,"rios"));
        //rios라는 value 값을 통해서 얻은 key 값 -> name
        System.out.println(getKey(hashMap,"rios0812@naver.com"));
        //rios0812@naver.com 라는 value 값을 통해서 얻은 key 값 -> email


        // ** key를 통해 value얻기 **

        String getName = (String) hashMap.get("name");
        System.out.println(getName);
        //name 이란 key값을 통해서 value 값은 -> rios

        String getPhone = (String) hashMap.get("phone_num");
        System.out.println(getPhone);
        //phone_num 이란 key값을 통해서 value 값은 -> 010-1234-1234
    }


    // hashmap에 value 로 key 찾기
    public static <K, V> K getKey(Map<K, V> map, V value) {

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
