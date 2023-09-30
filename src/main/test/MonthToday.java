package main.test;

import java.util.Calendar;

/*
이번 달의 “일요일”은 모두 몇 번 있을까?
예) 이번달이 2022년 1월인 경우, 답은 4가 나옴
 */
public class MonthToday {
    public static void main(String[] args) {
        //현재 날짜를 가져옵니다.
        Calendar calendar = Calendar.getInstance();

        //이번 달의 연도와 월을 가져옵니다
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        //이번 달의 첫번째 날짜로 설정합니다
        calendar.set(year, month, 1);

        //일요일 카운트 변수를 초기화합니다.
        int sundayCount = 0;

        //이번 달의 날짜 수를 가져옵니다.
        int lastDay = calendar.getMaximum(Calendar.DAY_OF_MONTH);


        //날짜를 1부터 마지막 날짜까지 증가시키면서 일요일인지 확인합니다.
        for(int day = 1; day<= lastDay; day++){
            if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                sundayCount++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1); //다음 날짜로 이동
        }
        System.out.println("이번 달의 일요일 개수 :"+ sundayCount);
    }
}
