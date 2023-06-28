package main.Lv1;

/*
 프로그래머스 Lv1 자연수 뒤집어서 배열에 담기
 */
class Solution40 {
    public int[] solution(long n) {
        String s = String.valueOf(n); // long > string
        StringBuilder sb = new StringBuilder(s);
        //reverse() 메소드를 이용하기 위해 
        //StringBuilder 인스턴스 생성

        //reverse() 문자열 뒤집기
        sb = sb.reverse();

        //String.split("") //한글자씩 잘라 배열에 담기
        String[] stringArr = sb.toString().split("");

        int[] answer = new int[sb.length()];
        //문자열 길이만큼 배열 길이할당

        //String > int > int[]

        for(int i = 0; i<sb.length(); i++){
            answer[i] = Integer.parseInt(stringArr[i]);
        }
        return answer;
    }
}

public class StringReverse {
    public static void main(String[] args) {
        Solution40 s = new Solution40();

        long n = 541389;
        System.out.println(s.solution(n));
    }
}

/*
class Solution {
  public int[] solution(long n) {

        // 문자열 + 숫자 = 문자열
        String a = "" + n;

        int[] answer = new int[a.length()];

        int cnt = 0;

        while (n > 0) {

            // 1) 12345 % 10 = 5
            // 2) 1234 % 10 = 4
            // 3) 123 % 10 = 3
            // 4) 12 % 10 = 2
            // 5) 1 % 10 = 1
            answer[cnt] = (int) (n % 10);

            // 12345 = 1234
            // 1234 = 123
            // 123 = 12
            // 12 = 1
            // 1 = 0 ( 0.1 )
            n /= 10;

            cnt++;
        }
        return answer;
  }
}

 */
