package main.Lv0;

/*
프로그래머스 Lv0 조건에 맞게 수열 변환하기1
 */

class Solution31 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];  //arr길이 만큼 선언

        for(int i = 0; i<answer.length; i++){  //0부터 answer길이만큼 반복
            if(arr[i] < 50 && arr[i] % 2 != 0){ // arr[i] 가 50보다 작거나 홀수면 곱하기2
                answer[i] = arr[i]*2;
            }else if(arr[i] >= 50 && arr[i] % 2 == 0){ //arr[i] 가 50보다 크거나 짝수면 나누기
                answer[i]  = arr[i]/2;
            }else{ // 아무런 조건도 충족 안하면 바꾸지 않기
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}

public class SequenceChange {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};

        Solution31 s = new Solution31();

        System.out.println(s.solution(arr));

    }
}
