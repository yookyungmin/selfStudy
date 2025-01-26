package main.java.collection;

import java.util.ArrayList;
import java.util.List;


//list는 데이터의 중복이 있을 수 있고, 순서도 있다.
public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("kim");
        list.add("kang");
        list.add("kim");

        System.out.println(list.size());

        for(int i =0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
