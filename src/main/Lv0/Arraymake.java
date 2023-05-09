package main.Lv0;

import java.util.*;
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
