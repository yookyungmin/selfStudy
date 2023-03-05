package main.Lv0;
//짝수는 싫어요
//        문제 설명
//        정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
class Solution12 {

        public int[] solution(int n) {
            int[] answer = new int[(n+1)/2];
            //배열 길이 선언
            for(int i = 1; i<=n; i++){ //n길이 만큼 반복문
                if(i%2==1){ //홀수를 찾아서
                    answer[i/2]=i;  //i의 의길이의 반이 인덱스
                }
            }
            return answer;
        }

}
public class EvenHate {

    public static void main(String[] args){
    Solution12 s = new Solution12();

        System.out.println(s.solution(8));
    }
}
