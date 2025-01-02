package main.Lv1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
1. 익명 클래스에 검색 값을 넣어주기 위해서 int 타입 search 와 sort 를 static 으로 선언

2. 검색 기준에 따라서 배열의 크기가 달라질 수 있으니 ArrayList<int[]> 타입 list 변수 선언

3. 검색 기준 매개변수에 따라 인덱스 번호 부여

4. 이후 for 문으로 data 돌면서 search 기준으로 값이 작은 것들 list에 추가

5. 정렬 기준 매개변수에 따라 인덱스 번호 부여

6. Comparator<int[]> 로 이차원 배열 정렬

o1[index] 하면 이 인덱스의 값을 기준으로 정렬 할 수 있다.

문제에서 오름차순으로 정렬해달라고 했으니 o1[] - o2[] 만약 내림차순이면 반대로 구현

정렬한 이차원 정수리스트 data
문자열 ext
정보의 기준 정수 val_ext
정렬 기준 sort_by
*/
public class DataAnal {

    static int search;
    static int sort;
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        //data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬하여

        ArrayList<int[]> list = new ArrayList<>();

        // 검색 값 설정
        if (ext.equals("code")) {
            search = 0;
        } else if (ext.equals("date")) {
            search = 1;
        } else if (ext.equals("maximum")) {
            search = 2;
        } else if (ext.equals("remain")) {
            search = 3;
        }

        // 검색 (val_ext 보다 작은 값 Search 후 list 에 넣기)
        for (int i = 0; i < data.length; i++) {

            if (data[i][search] < val_ext) {
                list.add(new int[] {data[i][0], data[i][1], data[i][2], data[i][3]});
            }
        }

        // answer 에 넣기
        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // 정렬 값 설정
        if (sort_by.equals("code")) {
            sort = 0;
        } else if (sort_by.equals("date")) {
            sort = 1;
        } else if (sort_by.equals("maximum")) {
            sort = 2;
        } else if (sort_by.equals("remain")) {
            sort = 3;
        }

        // 오름차순 정렬
        Arrays.sort(answer, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[sort] - o2[sort];
            }
        });


        return answer;
    }
}
