package main.Lv1;

/*
문자열을 정수로 바꾸기
 */
class Solution47{
    public int solution(String s){
        int answer = 0;
        char c = ' ';
        boolean sign = true; // + -  구분하기 위함

        for(int i = 0; i<s.length(); i++){
            c = s.charAt(i);
            if(c =='-'){
                sign = false; //-로 시작되면 sign false값
            }else if(c != '+'){ //두번째문자부터는 여기서부터
                answer = answer * 10 + (c - '0'); // 0 = 48 // c - '0' , c- 48을 빼줘야 정수가 들어감.
            }
        }return sign ? answer : - answer; //삼항연산자
    }
}

public class StringChange {
    public static void main(String[] args) {

        Solution47 s = new Solution47();

        String str = "1234";
        System.out.println(s.solution(str));
    }
}
