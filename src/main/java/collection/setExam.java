package main.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set은 중복이 없고, 순서도 없는 자료구조. Hashset과 TreeSet이 있다.
public class setExam {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(); //set은 인터페이스이기 떄문에 객체 생성이 불가하여 set을 구현한 HashSet으로 new 사용

        boolean flag1 = set1.add("Kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");
        //

        System.out.println(set1.size()); // 자료구조의 크기
        //kang이 중복되서 2가 나옴

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        Iterator<String> iter = set1.iterator();
        //하나씩 꺼낼 땐 Iterator 인터페이스 사용

        while(iter.hasNext()){ //데이터 존재 여부 확인 있으면 True
            String str = iter.next(); //값을 꺼내주라
            System.out.println(str);
        }

        for(String str : set1){
            System.out.println(str);
        }
    }
}
