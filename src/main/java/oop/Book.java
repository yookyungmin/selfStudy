package main.java.oop;

//OCP 확장에는 열려있고 수정에는 닫혀 있다.
//BOOK 클래스는 인터페이스를 사용하여 다양한 도서 유형에 대응
public interface Book {
    String getTitle();
    double getRentalPrice();
}
