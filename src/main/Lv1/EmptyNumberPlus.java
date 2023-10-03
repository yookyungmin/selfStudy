package main.Lv1;

/*
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.


 */
class Solution54{
    public int solution(int[] numbers){
        int answer = 45; //0~9 값 45

        for(int a : numbers){
            answer -= a; //향상된 for문으로 a값을 뱨주고 남은수가 없는 값을 더한 값
        }
        return  answer;
    }
}
public class EmptyNumberPlus {
    public static void main(String[] args) {
        Solution54 s = new Solution54();

        int[] numbers = {1,2,3,4,6,7,8,0};

        System.out.println(s.solution(numbers));
    }
}
