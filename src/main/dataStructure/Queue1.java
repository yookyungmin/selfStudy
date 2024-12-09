package main.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2); //문제 상황에서 값리턴
        q.add(3); //문제 상황에서 예외발생
        q.poll(); // 1 출력
        q.offer(4);
        q.poll(); //2 출력
    }
}
