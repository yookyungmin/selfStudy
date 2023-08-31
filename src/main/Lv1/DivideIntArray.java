package main.Lv1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution53{
    public ArrayList<Integer> solution(int[] arr, int divisor){

        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
            }
        }

        if(arrList.isEmpty()){
            arrList.add(-1);
        }else{
            Collections.sort(arrList);
        }

        return arrList;
    }
}
public class DivideIntArray {
    public static void main(String[] args) {
        Solution53 s = new Solution53();

        int arr[] = {5, 9, 7, 10};

        int divisor = 5;

        System.out.println(s.solution(arr, divisor));
    }
}
