package main.Lv1;

import java.util.*;


class Solution44 {
    public int solution(int[] nums) {
        int answer = 0;
        int pick = nums.length / 2; //n/2만 선택가능

        HashSet<Integer> set = new HashSet<>(); //중복 x 순서 x 중복값 제거

        for(int n : nums){
            set.add(n); //향상된 for문으로 담기 배열에만 사용 가능
        }

        if(pick>set.size()){
            answer = set.size(); //pick 이 set.size()보다 크면 set.size()반환
        }else{
            answer = pick;
        }

        return answer;
    }
}
public class Ponketmon {
    public static void main(String[] args) {
        Solution44 s = new Solution44();

        int[] nums = {3, 3, 3, 2, 2, 2};
        System.out.println(s.solution(nums));
    }
}
