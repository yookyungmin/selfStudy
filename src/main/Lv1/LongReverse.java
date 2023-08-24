package main.Lv1;


import java.util.Arrays;
import java.util.Collections;

/*
정수를 내림차순으로 정렬
 */

class Solution49 {
    public long solution(long n) {
        long answer = 0;

        String str = Long.toString(n); //long n을 String str에 저장하기 위한 형변환
        String[] arr = str.split("");  //str에 저장된 문자열을 "" 기준으로 나누어 배열에 각각 저장

        Arrays.sort(arr, Collections.reverseOrder()); //오름차순 정렬sort 후 내림차순 정렬

        str = String.join("", arr); //arr배열 내 각각 요소 뒤에 ""를 추가해 이어붙여 하나의 문자열로 생성
        answer = Long.parseLong(str); //string을 long으로 변환

        return answer;
    }
}
public class LongReverse {
    public static void main(String[] args) {
        Solution49 s = new Solution49();

        long n = 100L;
        System.out.println(s.solution(n));

    }
}
