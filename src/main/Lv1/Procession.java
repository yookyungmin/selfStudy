package main.Lv1;

//행렬의 덧셈
class Solution55 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = {};
        answer = arr1; //arr1 선언

        for(int i = 0; i<arr1.length; i++){ //행렬 행만큼 반복
            for(int j = 0; j<arr1[i].length; j++){  //2차원배열이기에 열만큼 반복
                answer[i][j] = arr1[i][j] + arr2[i][j];  //arr1 arr2 행렬의 index값을 더해 answer 행렬의 인덱스에 넣어줍니다
            }
        }
        return answer;
    }
}
public class Procession {
    public static void main(String[] args) {
        Solution55 s = new Solution55();

        int arr[][] = {{1,2}, {2,3}};
        int arr2[][] = {{3,4}, {5,6}};
        System.out.println(s.solution(arr, arr2));
    }
}
