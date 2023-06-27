package main.Lv1;
import java.util.ArrayList;
import java.util.Collections;


/*
프로그래머스 Lv1 명예의 전당
명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 매일 발표된 명예의 전당의 최하위 점수를
 return하는 solution 함수를 완성해주세요.
 */
class Solution39 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length]; //최저 점수 배열
        ArrayList<Integer> temp = new ArrayList<>(); //명예전당 리스트

        for(int i = 0; i<score.length; i++){ //score 배열만큼 반복문
            if(temp.size() < k){ //명예전당 리스트 크기가 k보다 작으면 score 값 넣기
                temp.add(score[i]); //값 넣기
                Collections.sort(temp); //정렬
                answer[i] = temp.get(0); //명예전당 리스트에서 최솟값을 가져와서 answer 배열에 넣기
                continue; //현재 단계중단
            }

            if(temp.size() == k){
                int minNum = temp.get(0); //명예전당 크기와 k가 같으면 최소값을 가져와서
                if(minNum < score[i]){  //최소값이스코어보다 크면
                    temp.remove(0); //값 삭제하고
                    temp.add(score[i]); //다시 점수 넣기
                    Collections.sort(temp); //정렬
                }
                answer[i] = temp.get(0);
            }
        }

        return answer;
    }
}
public class HonorList {
    public static void main(String[] args) {

        Solution39 s = new Solution39();
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(s.solution(k, score));
    }
}
