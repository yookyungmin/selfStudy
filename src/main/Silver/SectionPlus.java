package main.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 구간합구하기
 */
public class SectionPlus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader((new InputStreamReader(System.in)));

        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
                // bufferedReader를 했다는건 //예제 첫번째 줄을 읽어왔다는 말

        int suNo = Integer.parseInt(stringTokenizer.nextToken());  //숫자 갯수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());//질의 갯수

        long[] s = new long[suNo + 1]; //덧셈 곱셈 많을때 int 범위를 넘어가서 잘못나오는 경우가 있어서 long
        //0인덱스부터가 아닌 1인덱스를 기준으로 하기 위해 +1

        stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());

        for(int i = 1; i<=suNo; i++){
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }  //합배열

        for(int q = 0; q<quizNo; q++){
            stringTokenizer =
                    new StringTokenizer(bufferedReader.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(s[j] - s[i-1]);
        } // 질의 개수 반복 구간합 출력하기
    }
}
