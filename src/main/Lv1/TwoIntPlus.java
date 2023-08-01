package main.Lv1;

/*
프로그래머스 Lv1 두정수사이의 합
 */
class Solution43 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a < b){  //a가 b보다 작으면
            for(int i = a; i <= b; i++){
                answer += i;
            }
        }
        else if(a > b){ //b가 a보다 작으면
            for(int i = b; i <= a; i++){
                answer += i;
            }
        }else{
            answer = a;
        }
        return answer;
    }
}
public class TwoIntPlus {
    public static void main(String[] args) {
        Solution43 s = new Solution43();

        int a = 3;
        int b = 5;

        System.out.println(s.solution(a, b));
    }
}
