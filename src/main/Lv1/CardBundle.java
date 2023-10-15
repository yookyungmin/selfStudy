package main.Lv1;


/*
프로그래머스 Lv1 카드 뭉치
 */
class Solution57{
    public String solution(String[] cards1, String[] cards2, String[] goal){
        String answer = "";

        int idx1 = 0; //cards1 배열의 인덱스
        int idx2 = 0; //cards2 배열의 인덱스

        //goal 배열 순회

        for(String currentStr : goal){
            //currentStr이 cards1[idx1] 또는 cards2[idx2] 포함되는지 확인
            if(idx1 < cards1.length && currentStr.equals(cards1[idx1])){
                idx1++; //cards1[idx1]에 포함하는 경우 idx1증가
            }else if(idx2 < cards2.length && currentStr.equals(cards2[idx2])){
                idx2++; //cards2[idx2] 에 포함하는 경우 idx2
            }else{
                return "No"; //둘다 미포함
            }
        }
        return "Yes";
    }
}
public class CardBundle {
    public static void main(String[] args) {

        Solution57 s = new Solution57();

        String[] cards1 = {"i", "drink", "water"};

        String[] cards2 = {"want", "to"};

        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(s.solution(cards1, cards2, goal));

    }
}
