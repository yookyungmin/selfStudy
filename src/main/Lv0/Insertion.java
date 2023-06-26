package main.Lv0;
/*
 삽입 정렬은 정렬 범위를 1칸씩 확장해 나가면서 새롭게 정렬 범위에 들어온값을 기존값들과 비교하여
 알맞은 자리에 꼽아주는 알고리즘입니다.

 삽삽 정렬은 별도의 추가 공간을 사용하지 않고 주어진 배열이 차지하고 있는
 공간 내에서 값들의 위치만 바꾸기 때문에 O(N^2)의 공간 복잡도를 가집니다.
 */
public class Insertion {
    public static void sort(int[] arr) {
        for(int end = 1; end < arr.length; end++){
            int toInsert = arr[end]; //arr의 end인덱스 값이 ToInsert
            int i = end;
            while(i > 0 && arr[i-1]> toInsert){
                arr[i] = arr[i-1];
                i--;
            }
            arr[i] = toInsert;
        }
    }
}
