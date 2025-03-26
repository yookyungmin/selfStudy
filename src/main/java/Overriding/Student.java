package main.java.Overriding;

public class Student {
    String name;
    String number;
    int birthYear;

    public static void main(String[] args) {
        Student st = new Student();

        st.name = "홍길동";

        st.number = "1234";

        st.birthYear = 1995;

        Student st2 = new Student();

        st2.name = "홍길동";

        st2.number = "1234";

        st2.birthYear = 1995;

        if(st.equals(st2)){
            System.out.println("st==st2");
        }else{
            System.out.println("st!=st2");
        } //String으로 선언된건 heap 영역 내부에 존재하는 constant pool new는 힙메모리

    }
}
