package main.Lv0;
/*
두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
 */

class Solution24 {
    public int solution(int a, int b, boolean flag) {
        int answer = a-b;
        if(flag){  //flag true 시 - 가 아닌 + 가 되게끔
            answer = a+b;
        }
        return answer;
    }
}
public class flag {
    public static void main(String[] args) {
        Solution24 s = new Solution24();

        System.out.println(s.solution(3, 5, true));
    }
}
