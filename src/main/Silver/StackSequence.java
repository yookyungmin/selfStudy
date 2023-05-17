package main.Silver;

/*
[백준] 1874번 : 스택 수열
 */

import java.util.Scanner;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //수열의 갯수
        int[] A = new int[N]; //수열 갯수 만큼 A배열 생성

        for(int i = 0; i<N; i++){ //N길이 만큼 반복하고 A[i]번쨰에 scanner로 데이터 받기
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1; //오름차순이니 1부터
        boolean result = true; //No찍고 종료한걸 알아야 하기 떄문에 boolean 값
        for(int i = 0; i<A.length; i++){//수열탐색
            int su = A[i];
            StringBuffer bf = new StringBuffer();
            if(su >= num){// 현재 수열 값>= 오름차순 자연수면
                while (su >= num){ //값이 같아질떄까지
                    stack.push(num++); //stack 에 push를 하면서 같아질떄까지 반복, push 할때마다 num 값 증가
                    bf.append("+\n"); //push 할떄마다 + 찍기
                }
                stack.pop(); //똑같아지면 마지막에있는 값 가져오기
                bf.append("-\n"); //pop 연산시 - 찍기
            }else{ //현재 수열값<오름차순 자연수 //
                int n = stack.pop();
                if(n > su) { //stack pop 결과값 > 수열 수 보다 크면
                    System.out.println("NO");
                    result = false;
                    break; //No 찍고 반복문 종료 위해 break;

                }else {
                    bf.append("-\n");
                }
            }
            if(result) { //result true라면
                System.out.println(bf.toString());
            }

        }

    }
}
