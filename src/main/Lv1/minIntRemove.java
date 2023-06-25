package main.Lv1;

/*
프로그래머스 Lv1 제일 작은 수 제거하기
 */

class Solution38 {
    public int[] solution(int[] arr) {

        if(arr.length == 1){
            int[] answer = {-1};  // 배열길이가 1이면 -1 값을 가진 배열 반환
            return answer;
        }
        int[] answer = new int[arr.length -1]; //제일 작은 수를 제거 하고 저장하기 위하여 -1
        int min = arr[0]; // 가장 작은값만 저장하기 위한 배열 0인덱스에
        int idx = 0; //인덱스


        for(int i = 0; i<arr.length; i++){
            if(min>arr[i]){//min 값이 이 arr[i]보다 크면 arr[i] 는 제일 작은수
                min = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(min ==arr[i]) continue;  //제일 작은수와 일치한다면 계속, 아니면 answer 배열에 담기
            else{
                answer[idx] = arr[i];
                idx ++; //다음 인덱스에 저장하기 위하여 ++;
            }
        }

        return answer;
    }
}
public class minIntRemove {
    public static void main(String[] args) {
        Solution38 s = new Solution38();

        int[] arr = {4, 3, 2, 1};

        System.out.println(s.solution(arr));
    }
}
