package main.Lv1;
/*
프로그래머스 Lv1 크기가 작은 부분 문자열
 */
class Solution37 {
    public int solution(String t, String p) {
        int answer = 0;

        Long numberOfp = Long.valueOf(p); //String을 Long타입으로 변환

        for(int i = 0; i<= t.length() - p.length(); i++){
            String temp = t.substring(i, i+p.length()); //i 부터 i+p.length() 까지 인덱스 위치 값 반환
            Long numberOfTemp = Long.valueOf(temp); //temp Long타입으로 변환
            System.out.println(numberOfTemp);
            if(numberOfTemp <= numberOfp){
                answer++;
            }
        }
        return answer;
    }
}
public class SmallString {
    public static void main(String[] args) {
        Solution37 s = new Solution37();

        String t = "3141592";
        String p = "271";

        System.out.println(s.solution(t, p));
    }
}
