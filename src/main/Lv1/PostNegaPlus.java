package main.Lv1;

/*
어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs
가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

 */
public class PostNegaPlus {
    public int solution(int[] absolutes, boolean[] signs){
        int answer = 0;

        for(int i = 0; i< signs.length; i++){
            if(!signs[i]){
                absolutes[i] *= -1; // signs 값이 false 인 경우 -1 을 곱하여 음수로 변경 해준다.
            }
        }

        for(int i = 0; i< absolutes.length; i++){
            answer += absolutes[i];
        }

        /*
         for(int i =0; i< signs.length; i++){
            answer += absolutes[i] * (signs[i] ? 1: -1);
         }
         return answer // 다른 사람의 코드 //삼항 연산자로 사용해 true면 1을 곱하고 false면 -1을 곱해서 처리,.
         */
        return answer;
    }
}
