package main.Lv1;

import java.sql.SQLOutput;

/*
해당 문제는 그리디 알고리즘을 사용하는게 적합하다고 판단했다.

페인트 칠이 필요한 벽들의 번호를 담은 배열을 순서대로 탐색하여 처음 벽 번호 + 롤러 크기만큼에
해당하는 벽은 한번 칠한 걸로 하고 계속 반복하면 된다.

 현재 상황에서 가장 좋은 것(최선의 선택)을 고르는 알고리즘을 말합니다.
 */
class Solution56 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = section[0]; // 0인덱스 값을 start로
        answer++;

        for (int item : section) {
            if (start + m > item) {  // 더 해준값이 item보다 큰 경우 
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
