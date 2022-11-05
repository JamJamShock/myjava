package demo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath)throws Exception{
        Files.lines(Paths.get(filePath))
                .skip(1)
                .forEach(line ->{
                    for(String w:line.split("[ .]+")){
                        builder.add(w);
                    }
                });
    }

    public Stream<String> stream(){
        return builder.build();
    }

    public static void main(String[] args)throws Exception {
        new FileToWordsBuilder("myfile.txt").stream()
                .limit(10)
                .map(w -> w + " ")
                //.peek(System.out::println)
                .map(String::toUpperCase)
                //.peek(System.out::println)
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::print);
    }
}
