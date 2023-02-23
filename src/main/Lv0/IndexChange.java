package main.Lv0;

//인덱스 바꾸기
class Solution6 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        StringBuffer sb = new StringBuffer(my_string);
        // int num1 = a;
        // int num2 = b;
        // s.setCharAt(num1, my_string.subString(0, num2))

        char ch1 = my_string.charAt(num1);
        char ch2 = my_string.charAt(num2);
        //chartAt으로 인덱스별 문자열을 두개 뽑아낸후
        sb.setCharAt(num1, ch2);
        sb.setCharAt(num2, ch1);
        //StringBuffer 메서드 setCharAt으로 추출한 char로 교체

        return sb.toString();

    }
}
public class IndexChange {
    public static void main(String[] args){

        Solution6 s = new Solution6();

        System.out.println(s.solution("안녕하세요 후훗", 2, 5));
    }
}
