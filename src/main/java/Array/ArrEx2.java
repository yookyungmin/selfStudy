package main.java.Array;

import java.util.Scanner;

public class ArrEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개 정수 입력");

        for(int i =0; i< numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for(int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
            if(i< numbers.length -1 ){
                System.out.println(",");
            }
        }
    }
}
