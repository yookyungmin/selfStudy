package main.java.oop;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("M001", "홍길동");
        Book regularBook = new RegularBook("자바 프로그래밍");
        Book eBook = new EBook("Spring boot 가이드");

        BookRentalService rentalService = new BookRentalServiceImpl();

        RentalSystem rentalSystem = new RentalSystem(rentalService);

        rentalSystem.rentBook(member, regularBook);
        rentalSystem.rentBook(member, eBook);
    }
}

/*
    SRP: Member, RegularBook, EBook 클래슨느 각각 하나의 책임만 가짐
    OCP : 확장에는 열려 있고 수정에는 닫혀 있다.
    LSP : BOOK 인터페이스 타입으로 ReqularBook과 EBook으로 대체가능
    ISP : BookRentalService는 도서 대여와 관련기능만제공
    DIP: RentalSystem은 BookRentalService 인터페이스에 의존하므로 구현 변경에 영향을 받지 않는다
 */
