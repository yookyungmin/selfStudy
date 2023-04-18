package main.Bronze;

/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
 */
import java.util.Scanner;

public class NumberPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//숫자의 길이 입력
        String sNum = sc.next();
        //숫자를 문자열로 입력

        char[] cNum = sNum.toCharArray(); //문자열을 배열로 나눈다.
        int sum = 0;

        for(int i = 0; i<cNum.length; i++){
            sum+= cNum[i] - '0'; //int 형으로 바꿔주기 위해 - '0'
        }
        System.out.println(sum);
    }
}
