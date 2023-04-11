package main.Lv0;
/*
머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
 */
class Solution16 {
    public int solution(int order) {
        int answer = 0;
        String str = ""+order; //chartAt을 사용하기 위해 ""+로 정수형을 문자열로 바꿔준다.

        for(int i = 0; i<str.length(); i++){
            if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') answer++;
            //charAt을 사용하여 3 6 9 가 나오면 카운트가 되게끔 한다.
        }
        return answer;
    }
}
public class ThreeSixNine {
    public static void main(String[] args) {
        Solution16 s = new Solution16();

        int a = 3896183;
        System.out.println(s.solution(a));
    }
}
