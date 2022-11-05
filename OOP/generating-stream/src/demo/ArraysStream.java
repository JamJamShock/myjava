package demo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStream {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        IntStream stream= Arrays.stream(arr);
        int sum=stream.filter(a -> a > 5)
                .sum();
    }
}
