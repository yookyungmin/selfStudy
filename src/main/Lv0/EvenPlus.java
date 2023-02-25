package main.Lv0;
class Solution7 {
    public int solution(int n) {
        int answer = 0;


        if(n>0&&n<=1000){
            for(int i = 0; i<=n; i++){
                if(i%2==0){
                    answer+=i;
                }
            }

        }


        //n은 0보다 크고 1000보다 작은 수
        //n 이하의 짝수 구하기
        // 구해서 더하기
        return answer;
    }
}
public class EvenPlus {
    public static void main(String[] args){
        Solution7 s = new Solution7();

        System.out.println(s.solution(11));
    }
}
