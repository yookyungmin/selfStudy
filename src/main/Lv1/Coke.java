package main.Lv1;

class Solution58{
    public int solution(int a, int b, int n){

        int answer = 0;

        //a개씩 당 b개 총 갯수 n개
        while(a <= n){ // a 가 n보다 작으면 반복

            answer += n / a * b;

            n = (n / a * b) + (n * a); //  a의 배수에 들지 못하여 남은 개수(n % a)를 더해주어야 한다.

        }

        return answer;
    }
}
public class Coke {
    public static void main(String[] args) {
        Solution58 s = new Solution58();

        int a = 2;

        int b = 1;

        int n = 20;

        System.out.println(s.solution(a, b, n));
    }
}
