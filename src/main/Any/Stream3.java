package main.Any;

import java.util.ArrayList;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 1000000; i++){
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        list.stream()
                .map(x -> x * x)
                .forEach(x ->{
                    
                });

        long endTime = System.currentTimeMillis();
        System.out.println("map 소요" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();

        list.stream()
                .mapToInt(x -> x*x)
                .forEach(x ->{

                });
       endTime = System.currentTimeMillis();

        System.out.println("mapToInt 소요" + (endTime - startTime) + "ms");
    }
}
