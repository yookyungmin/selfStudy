package main.Lv0;

//나머지 구하기
class Solution8 {
    public int solution(int num1, int num2) {
        int answer = -1;

        answer = num1%num2;

        return answer;
    }
}


public class remain {
    public static void main(String[] args){

        Solution8 s = new Solution8();

        System.out.println(s.solution(3,8));

    }
}
