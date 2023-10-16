package main.Lv2;

public class TargetNumber {

    public static void main(String[] args) {
        Solution56 s = new Solution56();

        int number[] = {1,1,1,1, 1};

        int target = 3;

        System.out.println(s.solution(number, target));

    }
}
class Solution56 {
    int count = 0; //전역변수
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);
        answer = count;

        return answer;
    }
    public void dfs(int[] numbers, int depth, int target, int result){  //재귀함수 , depth 이진트리깊이, result 이전 노드까지 합계,
        if(depth == numbers.length){ //마지막 노드까지 진행 했을때
            if(target == result){ //target값과 합계가 같다면
                count++;
            }
            return;
        }
        int plus = result + numbers[depth]; //양수를 더한 값
        int minus = result - numbers[depth]; //음수를 더한값

        dfs(numbers, depth+1, target, plus);
        dfs(numbers, depth+1, target, minus);

    }
}
