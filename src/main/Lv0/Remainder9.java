package main.Lv0;

/*
음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.


 */
class Solution19 {
    public int solution(String number) {
        int answer = 0;

        //각 자릿수 더한값
        int sum = 0;

        //split 반환값 문자열 배열, 구분자로 나누어 배열로 만들기
        String[] number_list = number.split("");

        //  //배열 길이만큼 반복문을 돌려서 각 인덱스별 문자를 숫자로 바꾸어 더하기
        for (int i = 0; i < number_list.length; i++) {
            sum += Integer.parseInt(number_list[i]);
        }
        //더한 값을 9로 나누어 나머지 구하기
        answer = sum % 9;

        return answer;

    }
}

public class Remainder9 {
    public static void main(String[] args) {
        Solution19 s = new Solution19();

        String number = "12356";
        System.out.println(s.solution(number));
    }
}
