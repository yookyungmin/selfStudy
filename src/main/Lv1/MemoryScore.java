package main.Lv1;

import java.util.*;
import java.util.Map;

/*
photo 배열에는 사진에 찍힌 사람들의 이름이 담겨 있으며, 추억 점수를 계산할 사람들과 해당 사람들의 점수를 표현한 배열 name, yearning이 존재한다.
name 배열에 존재하는 사람들을 yearning 배열을 통해 계산할 점수를 얻고 photo에 존재하는 사람의 이름이 name에 존재할 때마다 yearning에 해당하는 점수를 증가시키는 문제다.
containsKey() 메서드를 통해 photo 배열을 순회하면서 각 이름이 point의 키로 존재하는지 확인할 수 있다.
photo 배열에 존재하는 이름이 map의 key로 존재하는 경우 해당 value를 꺼내 score 값에 더하여 answer 배열에 담는다.
*/

public class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        // 결과 배열
        int[] answer = new int[photo.length];

        // 사진별 추억점수 map 선언
        Map<String, Integer> point = new HashMap<>();

        //map에 담기
        for(int i = 0; i < name.length; i++){
            point.put(name[i], yearning[i]);
        }

        for(int i = 0; i< photo.length; i++){
            //사진에 있는 사람들을 배열에 담기
            String[] person = photo[i];

            int score = 0;

            for(int j = 0; j < person.length; j++){
                //사람의 이름 순차적으로 꺼내기
                String personName = person[j];

                //personName이 map에 key 값으로 하는 경우 해당 사람의 추억점수 더하기

                if(point.containsKey(personName)){
                    score += point.get(personName);
                }
            }
            answer[i] = score;
        }
        return answer;
    }

}