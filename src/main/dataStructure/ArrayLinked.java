package main.dataStructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinked {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        LinkedList linkedList = new LinkedList();

        //ArrayList add
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("ArrayList add:" + duration);

        //LinkedList add
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add : " + duration);

        //ArrayList get
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get : " + duration);

        //LinkedLiST get
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get : " + duration);

        //ArrayList remove
        startTime = System.nanoTime();
        for (int i = 9999; i < 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove : " + duration);

        //LinkedList remove
        startTime = System.nanoTime();
        for (int i = 9999; i < 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove : " + duration);

        System.out.println("=============================================================");

        ArrayList ary = new ArrayList(2000000);
        LinkedList lkd = new LinkedList();

        System.out.println("======순차적으로 추가하기======");
        System.out.println("ArrayList = " + addF(ary));
        System.out.println("LinkedList = " + addF(lkd));

        System.out.println("\n======중간에 추가하기======");
        System.out.println("ArrayList = " + addM(ary));
        System.out.println("LinkedList = " + addM(lkd));

        System.out.println("\n======중간에 삭제하기======");
        System.out.println("ArrayList = " + removeM(ary));
        System.out.println("LinkedList = " + removeM(lkd));

        System.out.println("\n======순차적으로 삭제하기======");
        System.out.println("ArrayList = " + removeF(ary));
        System.out.println("LinkedList = " + removeF(lkd));

    }

    public static long addF(List list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.nanoTime();

        return end - startTime;
    }

    public static long addM(List list) {
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(500, "X");
        }
        long end = System.nanoTime();
        return end - start;
    }

    public static long removeF(List list) {
        long start = System.nanoTime();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    public static long removeM(List list) {
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    /*
    결론
ArrayList는 검색이 LinkedList보다 훨씬 빠르므로 대량으로 데이터를 넣어놓고 검색 시 주로 사용
LinkedList는 삽입, 삭제가 ArratyList보다 훨씬 빠르므로 대량의 데이터를 삽입, 삭제할 때 주로 사용
but
순차적으로 추가/삭제 하는 경우 재배치가 필요하지 않기 때문에 ArrayList가 LinkedList보다 빠르다.
리스트 중간에 추가 / 삭제 하는 경우 각 노드간 연결만 변경해주면 되기 때문에 LinkedList가 ArrayList보다 빠르다.
     */
}
