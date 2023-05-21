package main.Lv1;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/*
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요
 */
class Solution5 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);//player가 없으면 0 +1 있으면player+1
        //1.HashMap을 만든다 (participant)
        for (String player : completion)
            map.put(player, map.get(player) - 1);//기존값을 가져와서 -1 값을 map에 넣러아달라

        //2. hashmap 을뺸다 (completon)

//        for(String key : map.keySet()){//map이 가지고 있는 키를 하나씩 꺼낸다 keyset //entryset이 반복문할때 성능이 좋다고
//            if(map.get(key) != 0){
//                answer = key;
//                break;// 아니면 break하여 반복문을 빠져나와서 return answer;
//            }
//        } //키셋 사용

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){//다음객체가 있는지 확인 hasNext

            Map.Entry<String, Integer> entry = iter.next();

            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }

        //엔트리셋 사용
        //3. value가 0 이 아닌 마지막 주차를 찾는다다

        return answer;
    }
}

public class ParticipantHash {

    public static void main(String[] args) {

        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};

        Solution4 s = new Solution4();

        System.out.println(s.solution(part, comp));
    }
}
