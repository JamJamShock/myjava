package demo;

import java.util.stream.Stream;

public class Main {
    /*
    Fabonancii 1 2 3 5 8 13
    */
    public static void main(String[] args) {
        Stream.iterate(1, i -> i + 1)
                .limit(5)
                .forEach(System.out::println);
    }
}
