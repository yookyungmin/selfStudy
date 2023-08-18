package main.Lv1;

class Solution48{
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
public class MeasurePlus {
    public static void main(String[] args) {
        Solution48 s = new Solution48();

        int number = 12;

        System.out.println(s.solution(number));
    }
}
