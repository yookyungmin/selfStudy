package main.Lv0;

import java.util.*;

/*
배열 만들기 1
문제 설명
정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 */
class Solution22 {
    public List solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();
        //배열 리스트 선언

        for(int i = 1; k*i<=n; i++){ // n까지 k와 i를 곱한값을 리스트에 넣는다.
            answer.add(k*i);
        }
        return answer;
    }
}
public class Arraymake {
    public static void main(String[] args) {
        Solution22 s = new Solution22();

        System.out.println(s.solution(10, 3));
    }
}
