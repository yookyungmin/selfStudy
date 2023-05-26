package main.Lv0;

class Solution27 {
    public String solution(String[] arr) {
        String answer = "";

        answer = String.join("", arr);

        return answer;
    }
}
public class ArrayCut {
    public static void main(String[] args) {
        Solution27 s  = new Solution27();

        String[] arr = {"asdsa", "zx", "we"};
        System.out.println(s.solution(arr));
    }
}
