package main.Lv0;

/*
프로그래머스 Lv0 원소들의 곱과 합
 */


class Solution30 {
    public int solution(int[] num_list) {
        int sum = 0;
        int mulSum = 1; //0이면 무조건 0이 나오니 1
        for(int i = 0; i<num_list.length; i++){
            sum += num_list[i];  //원소들의 합
            mulSum *= num_list[i]; //원소들의 곱
        }

        sum = sum*sum; //원소들의 합의 제곱

        if(mulSum<sum){ //원소들의 곱 < 원소들의 합의 제곱
            return 1;
        }else{
            return 0;
        }
    }
}
public class Arrayplusmultiple {
    public static void main(String[] args) {
        int[] list = {3, 5, 8, 6, 8};

        Solution30 s = new Solution30();
        System.out.println(s.solution(list));
    }
}
