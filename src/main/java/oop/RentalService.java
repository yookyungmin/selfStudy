package main.java.oop;


//Lsp: 부모 클래스 타입으로 자식 클래스를 대체 가능
public class RentalService {
    public void rentBook(Member member, Book book){
        System.out.println(member.getName() + book.getTitle() + book.getRentalPrice());
    }
}
