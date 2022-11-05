package demo;

import java.util.*;
import java.util.stream.Stream;

public class StreamOf {
    public static void main(String... args) {
        Stream.of(
                new Bubble(1),new Bubble(2),new Bubble(3)
        ).forEach(System.out::println);
        Stream.of("Java","is","cool")
                .forEach(System.out::println);
        Stream.of(3.1415,2.3,2.23)
                .forEach(System.out::println);

        List<Bubble> bubbles=List.of(
                new Bubble(1),
                new Bubble(2),
                new Bubble(3)
        );
        System.out.println( bubbles.stream()
                .mapToInt(Bubble::getI)
                .sum());
        Set<String> words=new LinkedHashSet<>(Arrays.asList(
                "Life is beautiful!".split(" ")
        ));
        words.stream()
                .map( w -> w + " ")
                .forEach(System.out::print);
        System.out.println();
        Map<String,Double> map=new HashMap<>();
        map.put("pi",3.1415);
        map.put("e",2.71);
        map.put("phi",1.35);
        map.entrySet()
                .stream()
                .map(e-> e.getKey() + " :"+ e.getValue())
                .forEach(System.out::println);
    }
}
