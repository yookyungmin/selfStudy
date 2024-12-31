package main.Lv1;

import java.util.ArrayList;
import java.util.List;

public class TwoNumPlus {
    public int[] solution(int[] numbers){

        //결과 list
        List<Integer> list = new ArrayList<>();

        //배열 numbers의 모든 두 요소의 합을 구하기 위해 2중 for문
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                //두 요소의 합이 list 에 존재하하지 않으면 담기
                if(!list.contains(numbers[i] + numbers[j])){
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        //list 오름차순 정렬하면 int 배열로 변환
        return list.stream().sorted().mapToInt(i -> i).toArray();
    }
}
