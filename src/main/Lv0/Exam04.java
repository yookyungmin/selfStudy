package main.Lv0;
class Solution4 {
    public int solution(int n, int t) {


        for(int i = 0; i<t; i++){
            n*=2;
        }

        return n;
    }
}
public class Exam04 {

    public static void main(String[] args){

        Solution4 s= new Solution4();

        System.out.println(s.solution(3, 4));


    }
}
