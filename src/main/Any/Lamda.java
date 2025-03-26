package main.Any;

import java.util.ArrayList;
import java.util.List;

public class Lamda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("c");
        list.add("React");

        for(String str : list){
            System.out.println(str);
        }

        System.out.println();

        list.stream().forEach((String str) -> System.out.println(str)); //forEach list 데이터를 순회
        //{} 뺴면; 생략

        System.out.println();

        list.stream().forEach( str -> System.out.println(str));//타입추론가능하기에 String제거

        System.out.println();

        list.stream().forEach(System.out::println);
        //세가지 방식 다 같음
    }
}
