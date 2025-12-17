package main.Lv0;

import java.util.Collections;
import java.util.PriorityQueue;


/*
우선순위 큐는 제일 먼저 추가된 원소 대신, 우선순위가 제일 높은 원소를 가장 먼저 꺼내온다.

우선순위를 오름차순, 내림차순 중 무엇으로 측정할지는 PriorityQueue의 생성자에 주입할 수 있다.
여기서는 내림차순(제일 큰 값부터 꺼내기)을 사용하기 위해 Collections.reverseOrder()를 주입해 주었다.

 1. 실행 대기 큐(Queue)에서 대기 중인 프로세스 하나를 꺼냅니다.
2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
  3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
 */
public class Prioque {

    class Solution {
        public int solution(int[] priorities, int location) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int priority : priorities) {
                pq.add(priority);
            }

            int count = 0;
            while (!pq.isEmpty()) {
                for(int i = 0; i < priorities.length; i++) {
                    if(priorities[i] == pq.peek()) {
                        pq.poll();
                        count++;

                        if(i == location) {
                            return count;
                        }
                    }
                }
            }
            return count;
        }
    }
}
