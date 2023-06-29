package main.Lv1;

/*
프로그래머스 L1 가장 가까운 글자
 */
class Solution41 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()]; //문자열 길이대로 배열 길이 지정


        String s2[] = s.split(""); //문자열을 1글자씩 잘라서 배열로 변환

        for(int i = 0; i<s2.length; i++){
            int n = 0; //찾는 대상으로 부터의 거리
            for(int j = i; j>=0; j--){  //이중 for문을 사용하여 s[i] 번쨰 와 가까워야 해서j--
                if((i!=j) && (s2[i].equals(s2[j]))){ //s[i] 에는 찾는 문자 s[j] 는 비교대상을 넣어줌
                    answer[i] = n;  //같으면 n을 넣고
                    break;
                }else{  //다르면 - 1 을 넣어주고 n을 증가
                    answer[i] = -1;
                    n++;
                }
            }
        }
        return answer;
    }
}
class Solution42{
    public static int[] solution42(String s){
        int[] answer = new int[s.length()];

        answer[0] = -1; //멘처음 글자는 무조건 -1

        for(int i = 1; i<s.length(); i++){
            int x = s.lastIndexOf(s.substring(i, i+1), i - 1); //i-1 기준으로 있는지 없는지 확인
            //lastIndexOf는 오른쪽 즉 뒤에서부터 문자열을 찾을때 사용하는 메서드
            if(x != -1){
                answer[i] = i-x //x가 -1 이 아니면 기존 위치의 인덱스에서 존재하는 인덱스의 값을 뺴서 넣으면 된다
;            }else{
                answer[i] = x; //x값이 -1 이면 -1 을 넣고
            }
        }
        return answer;
    }

}

public class CloseString {
    public static void main(String[] args) {
        Solution41 s = new Solution41();

        String str = "banana";

        System.out.println(s.solution(str));
    }
}


