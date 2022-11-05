package demo;

import java.util.Comparator;
import java.util.stream.Stream;

public class sortDemo {
    public static void main(String[] args) {
        Stream.of(3,5,6,7,4,2)
                .mapToInt(i -> i)
                .sorted()
                .forEach(a -> System.out.println( a + " "));
    }
}
