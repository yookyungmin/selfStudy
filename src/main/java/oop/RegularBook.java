package main.java.oop;

public class RegularBook implements Book{

    private String title;

    public RegularBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getRentalPrice() {
        return 2.0;
    }
}
