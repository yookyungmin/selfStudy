package main.Lv0;
/*
  프로그래머스 Lv 0 카운트 다운
 */
class Solution33 {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1]; // 배열 길이 설정

        int a = 0; //인덱스 범위 변수

        for(int i = start; i>=end; i--){ //start 부터 end 동안 1씩 감소
            answer[a] = i; // 배열 추가, answer[i] 로 하면 start index부터 들어가기 떄문에 a로 지정
            a++;  //인덱스 1씩 증가
        }

        return answer;
    }
}

public class CountDown {
    public static void main(String[] args) {
        Solution32 s = new Solution32();

        System.out.println(s.solution(10, 3));
    }
}
