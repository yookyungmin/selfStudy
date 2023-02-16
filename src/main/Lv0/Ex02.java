package main.Lv0;
//가장 큰수 찾기

import java.lang.reflect.Array;

class Solution2{
    public int[] solution(int[] array){
        int[] answer = new int[2];

        int max=0;
        int index = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
                index = i;
            }
        }
        answer[0]=max;
        answer[1] = index;
        return  answer;
    }
}

public class Ex02 {

    public static void main(String[] args){

        Solution2 solution = new Solution2();

        int[] a= {2, 5, 10,8};
       int[] result =  solution.solution(a);

       for(int i = 0; i<result.length; i++){
           System.out.println(result[i]);
       }



    }
}
