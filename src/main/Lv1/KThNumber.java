package main.Lv1;

import java.util.*;
class Solution45{
    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length]; //commands길이 만큼 지정

        for(int i = 0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);//정렬
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
public class KThNumber {
    public static void main(String[] args) {
        Solution45 s = new Solution45();

        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4,4,1}, {1, 7, 3}};

        System.out.println(s.solution(array, commands));
    }
}
