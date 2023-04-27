package main.Lv1;

import java.util.Arrays;

/*
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요
 */
class Solution4 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";


        Arrays.sort(participant);
        Arrays.sort(completion);
        //1. 두배열을 정렬한다.
        int i = 0;
        for(; i<completion.length; i++){
            if(!participant[i].equals(completion[i]))//둘이 같지않다면
                break;;
        }
        //2. 두배열이 다를떄까지 찾는다
        //3 여기까지 했다면 마지막 주자가 완주하지 못한 선수다
        return participant[i];
    }
}
public class Participant {

    public static void main(String[] args) {

        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};

        Solution4 s = new Solution4();

        System.out.println(s.solution(part, comp));
    }
}
