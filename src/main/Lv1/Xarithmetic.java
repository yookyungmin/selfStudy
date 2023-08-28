package main.Lv1;

/*
Lv1 x만큼 간격이 있는 n개의 숫자

 */
class Solution52{
    public long[] solution(int x, int n){
        long[] answer = new long[n]; //n만큼 길이의 배열 Long 이 아닌 long 타입 사용

        int num = x; //num으로 해야 등차수열이 된다.
        for(int i = 0; i<answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
public class Xarithmetic {
    public static void main(String[] args) {

        Solution52 s = new Solution52();
        int x = 2;
        int n = 5;

        System.out.println(s.solution(x, n));
    }
}
