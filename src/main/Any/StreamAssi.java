package main.Any;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssi {
    public static void main(String[] args) {
        //list 생성
        List<String> list = Arrays.asList("apple", "banna", "cherry", "date", "elderberry");

        //Listfmf Stream으로 변환하고 "apple"를 찾아 대문자로 변환
        List<String> result = list.stream()
                .filter(i -> i.equals("apple"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
