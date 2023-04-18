package main.Lv0;

/*
문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 */
import java.util.Arrays;
class Solution17 {
    public int[] solution(String my_string) {
        String number = "";
        char[] ch = my_string.toCharArray();
        //String 문자열을 한글자씩 쪼개서 char 타입 배열에 넣어준다.

        for(int i = 0; i< ch.length; i++){
            if(ch[i]>='0' && ch[i]<='9')
                number+=ch[i];
        }
        int[] answer = new int[number.length()];
        for(int i = 0; i<number.length(); i++){
            answer[i] = number.charAt(i) - '0';
            //char 타입 '0'을 빼줘야 정수로 바귄다.
        }
        Arrays.sort(answer);//정렬
        return answer;
    }
}
public class StringSort {
    public static void main(String[] args) {
        Solution17 s = new Solution17();

        System.out.println(s.solution("asdsd215846"));
        char a = '0';
        System.out.println(a+"b");
    }
}
