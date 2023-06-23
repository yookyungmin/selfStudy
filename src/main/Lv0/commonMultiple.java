package main.Lv0;

/*
   프로그래머스 Lv0 공배수
 */
class Solution35 {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number%n==0 && number%m==0){  //number 가 n의 배수이면서 m의 배수면 1 반환
            answer = 1;
        }else {
            answer = 0;
        }
        return answer;
    }
}
public class commonMultiple {
    public static void main(String[] args) {
        Solution35 s = new Solution35();

        int number = 60;

        int n = 2;

        int m = 3;

        System.out.println(s.solution(number, n, m));
    }
}
