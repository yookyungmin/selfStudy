package main.Lv0;

import java.util.ArrayList;
import java.util.List;


/*
    프로그래머스 Lv0 공백으로 자르기2
 */
class Solution34{
    public List Solution(String my_string){
        List<String> answer = new ArrayList<>(); //리스트 선언

        String[] my_string_list = my_string.split(" "); //공백을 기준으로 짤라서 배열에 저장

        for(int i = 0; i < my_string_list.length; i++){ //배열 길이만큼 반복
            if(!my_string_list[i].equals("")){  //해당 인덱스 값이 비어있지 않다면 담기
               answer.add(my_string_list[i]);
            }
        }

        return  answer;
    }
}

public class gapSplit {
    public static void main(String[] args) {

        Solution34 s = new Solution34();

        String str = "my name is";

        System.out.println(s.Solution(str));
    }

}
