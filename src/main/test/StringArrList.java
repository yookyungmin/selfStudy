package main.test;

import java.util.ArrayList;
import java.util.List;

public class StringArrList {
    public static void main(String[] args) {

        List<int[]> list = new ArrayList<>();

        list.add(new int[]{9, 11, 16, 21, 28, 36, 5});
        list.add(new int[]{3, 9, 10, 29, 40, 45, 7});
        list.add(new int[]{2, 5, 12, 14, 24, 39, 33});
        list.add(new int[]{1, 6, 13, 37, 38, 40, 9});
        list.add(new int[]{1, 21, 25, 29, 34, 37, 36});

        List<Integer> resultList = new ArrayList<>();

        for(int[] arr : list){
            for(int element : arr){
                if(!resultList.contains(element)){
                    resultList.add(element);
                }
            }
        }
        System.out.println(resultList);
    }
}
