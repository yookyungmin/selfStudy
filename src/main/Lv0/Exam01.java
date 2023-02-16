package main.Lv0;
//배열의 유사도
 class Solution1 {


    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int count = 0;

        for(int i = 0; i<s1.length; i++){
            for(int j = 0; j<s2.length; j++){
                if(s1[i].equals(s2[j])){
                    count++;
                }
            }
        }
        answer = count;
        return answer;
    }
}

public class Exam01 {
    public static void main(String[] args){
        Solution1 s = new Solution1();
        String[] str1 = {"기린", "펭귄"};
        String[] str2 = {"기린", "펭귄", "호랑이", "원숭이"};


        System.out.println(s.solution(str1,str2));



    }





}
