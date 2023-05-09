package main.Lv0;


/*
이어 붙인 수
문제 설명
정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로
이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 */
class Solution23 {
    public int solution(int[] num_list) {
        int answer = 0;

        String even = ""; //짝수
        String odd = ""; //홀수

        for(int i : num_list){ //향상된 for문 사용으로 배열을 반복문 돌려서
            if(i%2 == 0){ // 짝수에 해당되는건 숫자+"" 로 문자열로 변경하고 더해서 붙이기
                even += i+"";
            }else{ //홀수에 해당 되는 숫자+""로 문자열로 변경하고 더해서 붙이기
                odd += i+"";
            }
        }

        answer = Integer.parseInt(even)+Integer.parseInt(odd);
        //문자열을 숫자로 변경하여 더하기

        return answer;
    }
}
public class StringOddEvenPlus {
    public static void main(String[] args) {
        Solution23 s = new Solution23();

        int[] a = {5,3,6,28,6};

        System.out.println(s.solution(a));
    }
}
