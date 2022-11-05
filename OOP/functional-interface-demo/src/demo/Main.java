package demo;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Supplier<RuntimeException>
                obj= RuntimeException::new;

        Consumer<String> obj2= System.out::println;
        obj2.accept("Hello ! Java is cool");

        RuntimeException obj3=getInstance(RuntimeException::new);

        Function<String,Integer> obj4 = a -> a.length();
        System.out.println("length : "+ obj4.apply("hello"));

        Predicate<Integer> predicate = a -> a > 10;
        System.out.println("predicate.15");

        UnaryOperator<String> unaryOperator=s -> "Hello !" + s;
        System.out.println(unaryOperator.apply("Harry"));
    }
    public static <T> T getInstance(Supplier<T>t){
        return t.get();
    }
}
