package main.Lv0;
import java.util.Arrays;

/*
배열 자르기
 */
class Solution26 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[numbers.length]; //numbers길이만큼 저장

        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        //배열 복사방법
        // Arrays.copyOf(복사할 배열, 복사할 배열의 크기)
        //Arrays.copyOfrange(복사할 배열, 시작위치, 배열크기)

        return answer;
    }
}
public class ArraySlice {
    public static void main(String[] args) {
        Solution26 s = new Solution26();

        int numbers[] ={1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(s.solution(numbers, num1, num2));
    }
}
