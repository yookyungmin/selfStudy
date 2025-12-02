package main.Lv1;

/*
  프로그래머스 Lv1 약수 갯수 더하기
 */

class Solution34 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++){ // left 부터 right동안 반복
            int count = 0;  //약수 갯수 카운트

            for(int j=1; j<=i; j++){  // 약수를 구하기 위해 j = 1 부터 i 수 동안
                if(i%j==0){  // i를 j를 나눠서 0이면 약수이기에 ++ 해준다
                    count++;
                }
            }

            if(count%2==0){  //약수의 갯수가 짝수인 수는 ++
                answer += i;
            }else{  // 약수의 갯수가 짝수가 아니면 -- 해준다
                answer -= i;
            }
        }

        return answer;
    }
}
public class FactorCount {
    public static void main(String[] args) {
        Solution34 s = new Solution34();

        int left = 13;
        int right = 47;

        System.out.println(s.solution(left, right));
    }
}
