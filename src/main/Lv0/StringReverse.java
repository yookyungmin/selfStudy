package main.Lv0;

public class StringReverse {

    public String reverse(String str){

        String resultStr = "";

        for(int i = str.length()-1; i>=0; i--){ // length() -1 이유 chartAt 인덱스 0부터 시작하기 떄문
            resultStr += str.charAt(i); //문자열 + 문자  = 문자열
        }

        return resultStr;
    }

    public static void main(String[] args) {

        StringReverse fq = new StringReverse();

        String str = "HELLO";

        System.out.println(fq.reverse(str));

    }
}


