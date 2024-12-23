package main.java.oop;


//DIP 고수준 모듈이 저수준 모듈에 의존하지 않음
//RentalService는 인터페이스(BookRentalService)에 의존
public class RentalSystem {

    private final BookRentalService bookRentalService;

    public RentalSystem(BookRentalService bookRentalService) {
        this.bookRentalService = bookRentalService;
    }

    public void rentBook(Member member, Book book){
        bookRentalService.rentBook(member, book);
    }
}
