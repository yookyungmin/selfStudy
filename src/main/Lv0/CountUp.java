package main.Lv0;
import java.util.*;

class Solution41 {
    public List solution(int start, int end) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = start; i<=end; i++){
            answer.add(i);
        }
        return answer;
    }
}
public class CountUp {
    public static void main(String[] args) {
        Solution41 s = new Solution41();

        int start = 3;
        int end = 10;

        System.out.println(s.solution(start, end));
    }
}
