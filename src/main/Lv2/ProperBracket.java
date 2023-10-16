package main.Lv2;

import java.util.*;
//stack 사용
//
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>(); // '()' 같은 문자이므로 Charcater

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('('); //(이면 스택에 넣기
            }else if(s.charAt(i) == ')') {
                if(stack.isEmpty()){ // )인데 스택 비어있으면 잘못되었다는거니 false반환
                    return false;
                }
                stack.pop(); //원소 제거 //스택 비어있지 않으면 (가 있으니 쌍맞추는의미로 ( 빼주기
            }
        }

        if(!stack.isEmpty()){
            return false;
        } // 탐색이 끝났는데 스택에 무언가 있다면 false 반환

        return answer;
    }
}

public class ProperBracket {
    public static void main(String[] args) {
        String str = "()()";

        String str2 = ")()(";

        Solution s = new Solution();

        System.out.println(s.solution(str));
    }
}
