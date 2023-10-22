package main.Lv2;

import java.util.PriorityQueue;

/*
`       프로그래머스 Lv2 더맵게

        peek() 맨앞에 값 보기
        poll() 맨앞 빼기
        add(), offer() 넣기

        섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)


*/
class Solution59{
    public int solution(int[] scoville, int k){
        int answer = 0;
        int one, two;

        PriorityQueue<Integer> queue = new PriorityQueue<>(); //큐생성 fifo 생성하면 최소힙으로 만들어줌

        for(int i = 0; i<scoville.length; i++){
            queue.add(scoville[i]); //할당
        }

        while (queue.peek() < k){ //멘 앞 값이 7보다작으면
            if(queue.size() < 2) {
                return -1;  // 모든 음식 스코빌 지수를 K이상으로 만들지 못한 경우
            }else {
                one = queue.poll(); //첫번째 값 빼기
                two = queue.poll(); //두번째 값 빼기

                one += (two * 2);
                ////섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

                queue.offer(one); //값 넣기

                answer ++;
            }
        }
        return answer;
    }
}


public class MoreSpicy {
    public static void main(String[] args) {

        Solution59 s = new Solution59();

        int scoville[] = {1, 2, 3, 9, 10,12};
        int k = 7;

        System.out.println(s.solution(scoville, k));

    }
}
