package main.Lv1;

public class RemainPlus {
    public int solution(int n) {

         /*
        n의 최소값은 3이기 때문에 3을 나눠서 1이 나누는 최소값은 2부터 시작
        i는 n보다 커질 수 없음
        n을 i로 나눠서 1이 되는 경우 for문 종료
        */

        int answer = 0;
        for(int i = 2; i<n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
