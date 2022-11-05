package demo;

import java.time.LocalDate;

public class Book extends Product{

    private LocalDate yearPublished;
    private String publisher;

    public Book(String name, double price, LocalDate yearPublished, String publisher) {
        super(name, price);
        this.yearPublished = yearPublished;
        this.publisher = publisher;
    }

    @Override
    public double computeSalesPrice() {
        return getPrice() * 0.5;
    }
}
