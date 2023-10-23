package main.Lv2;

import java.util.HashMap;

/*
프로그래머스 Lv2 전화번호 목록
 */

class Solution60 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : phone_book) {
            map.put(str, 1);  //향상된 배열을 for문으로 map에 값담기
        }

        for (String str : phone_book) {
            for (int j = 1; j < str.length(); j++) {
                String prefix = str.substring(0, j);  //0인덱스 부터j까지 접두사

                if (map.containsKey(prefix)) { //map에 접두사가 포함되어있으면 true
                    return false;
                }
            }
        }
        return answer;
    }
}
public class PhoneBook {
    public static void main(String[] args) {

        Solution60 s = new Solution60();

        String[] phone_book = {"123","456","789"};

        System.out.println(s.solution(phone_book));

    }
}
