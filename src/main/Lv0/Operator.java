package main.Lv0;

class Solution9{
    public int plus(int a, int b){

        return a+b;
    }

    public int minus(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }



}


public class Operator {

    public static void main(String[] args){

        Solution9 s  = new Solution9();

        System.out.println(s.plus(2,4));
        System.out.println(s.minus(2, 8));
        System.out.println(s.multiply(2,5));
        System.out.println(s.divide(3,9));
    }
}
