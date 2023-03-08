package main.Lv0;
/*
제 설명
정수가 담긴 리스트 num_list가 주어질 때,
num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
class Solution14 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i=0;i<num_list.length;i++) { //배열 길이만큼 반목문 돌려서
            if(num_list[i] % 2 == 0) {
                answer[0]++; // 짝수면 0인덱스 갯수추가
            } else { 
                answer[1]++; //홀수면 1인덱스에 갯수추가
            }
        }
        return answer;
    }
}
public class OddEvenCount {

    public static  void main(String[] args){
        Solution14 s = new Solution14();
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(s.solution(a));
    }
}
