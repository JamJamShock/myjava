package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        Stream.of(
                1,2,3,4,5,6,6,7,8,9
        )
                .filter( i -> i > 5)
                .mapToInt(i -> i)
                .average()
                .ifPresentOrElse(a -> System.out.println("avg : " + a),
                        ()->{
                            System.out.println("there is no avg ");
                        });

        Optional<String> foundName = Stream.of("Thomas","Dollar","Richard","Horace","David")
                .filter(s -> s.startsWith("D"))
                .findAny();

        if(foundName.isPresent()){
            String name=foundName.get();
            System.out.println("Names first starts with D : " + name +".");
            System.out.println("");
        }

        List<String> sl = Arrays.asList(
                "Thomas",
                "Dollar",
                "Richard",
                "Horace",
                "Dinny",
                "D boy"
        );
        sl.parallelStream()
                .filter( a -> a.startsWith("D"))
                .findAny()
                .ifPresent(System.out::println);
    }
}
