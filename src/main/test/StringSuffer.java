package main.test;

import java.util.Random;
/*
문자열의 내용을 임의로 섞어서 새로운 문자열로 조합하기
예) “1234567890” -> “4065197823”
위의 예제와 같이 입력받은 문자 또는 숫자의 순서를 임의(random)로 바꾸어서 재배열해 본다
 */
public class StringSuffer {

    public static String shuffleString(String input){
        //입력 문자열을 문자배열로 반환
        char[] charArray = input.toCharArray();

        //문자 배열을 무작위로 섞음
        Random random = new Random();

        for(int i = charArray.length -1; i>0; i--){
            int j = random.nextInt(i+1);

            char temp = charArray[i]; //인덱스별로 값 가져오기
            charArray[i] = charArray[j];
            charArray[j] = temp;

        }

        return new String(charArray);
    }
    public static void main(String[] args) {
        String originalString = "1234567890";
        String shuffledString = shuffleString(originalString);

        System.out.println("원본 문자열: " + originalString);
        System.out.println("섞인 문자열: " + shuffledString);
    }

}
