package main.Lv0;

/*
     프로그래머스 접두사인지 확인
 */
class Solution29 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            //startsWith() 함수는 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크
            answer = 1;
        }
        return answer;
    }
}

public class Stratwith {
    public static void main(String[] args) {
        Solution29 s = new Solution29();

        String str = "banana";

        String is_prefix = "ban";

        System.out.println(s.solution(str, is_prefix));
    }
}
