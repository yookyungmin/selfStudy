package main.Lv0;
import java.util.*;

/*
프로그래머스 Lv0 할일 목록
 */
class Solution28 {
    public List solution(String[] todo_list, boolean[] finished) {

        List<String> answer = new ArrayList<>(); //리스트 선언
        for(int i = 0; i<todo_list.length; i++){
            if(finished[i] ==false){  //boolean 배열값과 같으면 add
                answer.add(todo_list[i]);
            }
        }
        return answer;
    }
}
public class Todo {
    public static void main(String[] args) {
        String[] str = {"problemsolving", "practiceguitar", "swim", "studygraph"};

        boolean[] finished = {true, false, true, false};

        Solution28 s = new Solution28();
        System.out.println(s.solution(str, finished));
    }
}
