package main.Silver;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
BeakJoon 백준 2164번 카드2(Java)

 */
public class Card2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>(); //데이터를 자유롭게 삽입 삭제
        int N = sc.nextInt(); //카드의 갯수

        for(int i = 1; i<=N; i++){
            myQueue.add(i);
        }
        while(myQueue.size() > 1){//카드 한장남을떄가지 반복
            myQueue.poll(); //첫번째 들어간 값을 버리기
            int temp = myQueue.poll(); //두번째 카드는 가장 아래로 이동하기 위해 변수 지정
            myQueue.add(temp); //아래에 추가
        }
        System.out.println(myQueue.poll());
    }
}
