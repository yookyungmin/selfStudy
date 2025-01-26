package main.java.collection;

public class BoxExam {
    public static void main(String[] args) {
//        Box box = new Box();
//
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        box.setObj("hello"); //타입이 오브젝트라 가능하다.
//
//        String str = (String) box.getObj();
//
//        System.out.println(str);
//        int value = (int) box.getObj();  //제네릭 적용 전 형변환 필요

        Box<Object> box = new Box<>();
        box.setObj(new Object());
        Object object = box.getObj();
        
        Box<String> box2 = new Box<>();
        box2.setObj("hello");
        String objStr = box2.getObj();

        Box<Integer> box3 = new Box<>();
        box3.setObj(4);
        int objInt = box3.getObj();
        //제네릭 적용, 형변환 생략가능
    }
}
