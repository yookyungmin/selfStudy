package main.Lv1;

import java.util.ArrayList;

/*
모의고사

수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */

public class gosaTest {


    public int[] solution(int[] answers) {
        // 1️⃣ 수포자 패턴 정의
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 2️⃣ 각 수포자의 점수 세기 (완전 탐색)
        int[] scores = new int[3]; // 수포자 1,2,3 점수
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % supo1.length]) scores[0]++;
            if (answers[i] == supo2[i % supo2.length]) scores[1]++;
            if (answers[i] == supo3[i % supo3.length]) scores[2]++;
        }

        // 3️⃣ 최고 점수 찾기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 4️⃣ 최고 점수를 맞춘 사람 찾기
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                result.add(i + 1); // 수포자는 1번부터
            }
        }

        // ArrayList -> int[] 변환 후 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}

