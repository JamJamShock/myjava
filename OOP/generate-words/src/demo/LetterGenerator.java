package demo;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetterGenerator implements Supplier<String> {
    Random random=new Random();
    char[] letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        String word = Stream.generate(new LetterGenerator())
                .limit(30)
                .sorted()
                .collect(Collectors.joining());
        System.out.println(word);
    }
}
