package main.Lv1;


class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        double sum = 0;



        if((arr.length>=1 && arr.length<=100)){

            for(int i = 0; i<arr.length; i++) {
                sum += arr[i];

                answer = sum/arr.length;
            }
        }

    

        return answer;
    }
}

public class Avg {

    public static void main(String[] args){
            Solution s = new Solution();
            int[] arr ={2, 5, 8, 60, 9};
        System.out.println(s.solution(arr));

    }
}
