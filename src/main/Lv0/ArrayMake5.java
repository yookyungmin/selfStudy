package main.Lv0;

import java.util.*;
class Solution42 {
    public List solution(String[] intStrs, int k, int s, int l) {

        //1.문자열에서 s번째에서 시작하는 l 짜리 문자열이 k보다 크면 배열에 담기

        ArrayList<Integer> list = new ArrayList<>(); //List선언

        for(String str : intStrs){ //향상된 for문 배열만 가능
            int number = Integer.parseInt(str.substring(s, s+l)); // s부터 s+l까지 범위를 잘라서 숫자 number 변환
            if(number>k){
                list.add(number); //k보다 number가 크면 리스트에 담기
            }
        }
        return list;
    }
}
public class ArrayMake5 {
    public static void main(String[] args) {
        Solution42 s = new Solution42();

        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 5000;
        int a = 5;
        int l = 5;

        System.out.println(s.solution(intStrs, k, a, l));

    }
}
