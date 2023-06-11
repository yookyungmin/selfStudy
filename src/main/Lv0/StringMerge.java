package main.Lv0;
/*
프로그래머스 더 큰수 합치기
 */

class Solution32 {
    public int solution(int a, int b) {
        int answer = 0;

        String strA = a + ""; //숫자를 문자열로
        String strB = b + "";

        String strAB = strA+strB; //문자열끼리 + 하면 붙는다
        String strBA = strB+strA;

        int num1 = Integer.parseInt(strAB); //문자열을 숫자로
        int num2 = Integer.parseInt(strBA);

        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
}
public class StringMerge {
    public static void main(String[] args) {
        int a = 2;
        int b = 25;

        Solution32 s = new Solution32();

        System.out.println(s.solution(a, b));
    }
}
