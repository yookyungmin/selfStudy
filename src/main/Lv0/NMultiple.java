package main.Lv0;
/*
정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을
제거한 배열을 return하도록 solution 함수를 완성해주세요.
 */
class Solution15{
    public int[] solution(int n, int[] numlist){
        int[] array = new int[numlist.length];
        int count=0;

        for(int i = 0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                array[count] = numlist[i];//n의 배수면 count 인덱스에 저장
                count++; //n의 배수일때 값넣고 인덱스로 들어갈 숫자 +1
            }
        }

        int[] answer = new int[count]; //count 숫자에 맞게끔 배열길이 설정

        for(int i = 0; i<answer.length; i++){
            answer[i]=array[i]; //값 넣기
        }
        return answer;
    }
}
public class NMultiple {

    public static void main(String[] args) {
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        Solution15 s = new Solution15();

        System.out.println(s.solution(3, numlist));
    }
}
