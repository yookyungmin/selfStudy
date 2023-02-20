package main.Lv1;

 class Solution1{
     public String solution(int num){
         String answer = "";

         if(num%2==0){
             answer="Even";
         }else{
             answer="Odd";
         }
         return  answer;
     }

}

public class OddEven {

    public static void main(String[] args){


            Solution1 s1 = new Solution1();

        System.out.println(s1.solution(6));
    }
}
