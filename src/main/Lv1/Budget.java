package main.Lv1;
import java.util.Arrays;

/*
프로그래머스 Lv1 예산
 */
class Solution36 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);  //오름차순 정렬

        for(int i = 0; i<d.length; i++){
            if(d[i]<=budget){
                budget = budget - d[i];
                //남은 예산이 지원금액보다 크거나 같으면 지원하고 예산에서 제외

                answer ++; //부서 지원할때 마다 1증가
            }else{
                break;  //예산 부족하면 중단
            }
        }

        return answer;
    }
}
public class Budget {
    public static void main(String[] args) {
            Solution36 s = new Solution36();
            
            int[] d = {1,3,2,5,4};
            int budget = 9;
            
            System.out.println(s.solution(d, budget));
    }
}
