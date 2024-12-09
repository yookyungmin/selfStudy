package main.Lv0;
/*
병합 정렬은 분할정복 기법과 재귀 알고리즘을 이용해서 정렬 알고리즘입니다.
즉, 주어진 원소가 하나밖에 남지 않을 떄까지 계속 둘로 쪼갠 후에 다시 크기 순으로 재배열 하면서 원래 크기의 배열로 합칩니다.
시간 복잡도는 O(NlogN) 입니다.
 */
public class MergeSort {
    public static void mergeSort(int[] arr) {

        sort(arr, 0, arr.length);
    }
    private static void sort(int[] arr, int low, int high){
        if(high - low < 2){
            return;
        }
        int mid = (low+high) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        while(l < mid && h < high){
            if(arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            }else{
                temp[t++] = arr[h++];
            }
        }

        while (l<mid){
            temp[t++] = arr[l++];
        }

        while (h < high){
            temp[t++] = arr[h++];
        }

        for(int i = low; i < high; i++){
            arr[i] = temp[i-low];
        }
    }
}
