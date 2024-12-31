package main.Lv1;


/*
strNum 문자열 배열에 0부터 9까지 해당하는 영단어를 담는다.
strNum 배열의 길이만큼 반복하여 문자열 s의 strNum[i]번째에 해당하는 문자를 i로 치환한다. (i는 int 타입으로 Integer.toString() 메서드를 통해 문자열로 타입으로 변환할 수 있다.)
완성된 문자열 s를 int 타입으로 변환하여 반환한다.
 */
public class NumberString {
    public int solution(String s){
        String[] strNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i< strNum.length; i++){
            s.replaceAll(strNum[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
