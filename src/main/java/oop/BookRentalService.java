package main.java.oop;

// ISP : 인터페이스 분리
// BookRentalService는 도서 대여와 관련된 인터페이스만 제공
public interface BookRentalService {
    void rentBook(Member member, Book book);
}
