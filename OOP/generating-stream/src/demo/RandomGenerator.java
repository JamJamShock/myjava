package demo;

import java.util.Random;
import java.util.stream.Stream;

public class RandomGenerator {

    public static <T> void show(Stream<T> stream){
        stream
                .limit(3)
                .forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++");
    }

    public static void main(String []args) {
        Random random=new Random();
        show(random.ints().boxed());
        show(random.doubles().boxed());

        //Control the lower and upper bound
        show(random.ints(50,100).boxed());
    }
}
