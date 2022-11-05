package demo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product=new Product("P001","Apple","2000","Good Taste",LocalDate.now(),20);

        Product product1=new ProductBuilder()
                .create()
                .addName("Orange")
                .addPrice("3000")
                .build();
    }
}
