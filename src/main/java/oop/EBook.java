package main.java.oop;

public class EBook implements Book{

    private String title;

    public EBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getRentalPrice() {
        return 1.0;
    }
}
