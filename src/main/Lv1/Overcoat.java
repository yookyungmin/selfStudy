package main.Lv1;

import java.sql.SQLOutput;

class Solution56 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = section[0];
        answer++;

        for (int item : section) {
            if (start + m > item) {
                continue;
            }

            start = item;
            answer++;
        }

        return answer;
    }
}

public class Overcoat {
    public static void main(String[] args) {
        Solution56 s = new Solution56();

        int n = 8;
        int m = 4;

        int[] section = {2, 3, 6};

        System.out.println(s.solution(n, m, section));
    }
}
