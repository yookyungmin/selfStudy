package main.Lv0;




class Solution3 {

    public int solution3(int n){

        int answer = 0;


        String str = String.valueOf(n);
        //int 를 String 형식으로
        //string은 각자릿수를 구할수 있다


        for(int i = 0; i<str.length(); i++){

            answer += Integer.parseInt(str.substring(i, i+1));

        }
        return  answer;
    }

    /*
       int answer = 0;


        while(n>0){
            answer+= n%10;
            //1의 자릿수를 구하기 위해 나머지 구하는 공식 사용

            n/=10; //못구하기

        }

        return  answer;
    }

    // 각 자릿수를 구하기 위해 10씩씩
     */
}

public class Ex03 {

    public static void main(String[] args){
        Solution3 s = new Solution3();

        int num =  1258;

        System.out.println(s.solution3(num));

    }
}
