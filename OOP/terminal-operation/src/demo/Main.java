package demo;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Optional<Double> avg = average(100,90);

        System.out.println(" or () : " + avg.or(()-> Optional.of(0.00)));
        System.out.println(" orElse () : " + avg.orElse(Double.NaN));
        System.out.println(" orElseThrow() : " + avg.orElseGet(()-> 3.5));
        System.out.println(" orElseThrow() : " + avg.orElseThrow(RuntimeException::new));

        if(avg.isPresent()){
            System.out.println("");
            System.out.println(" avg : "+ avg.get());
        }
        else {
            System.out.println("");
            System.out.println(avg);
        }
    }
    public static Optional<Double> average(int ...nums){
        System.out.println("");
        String s1="Java is cool";
        //Optional<String> stringOptional = s1 == null ? Optional.empty() : Optional.of(s1);
        Optional<String> stringOptional=Optional.ofNullable(s1);
        stringOptional.ifPresentOrElse(System.out::println,
                ()->{
                    System.out.println("s1 is empty or null");
                });

        if(nums.length == 0 ){
            return Optional.empty();
        }
        double sum=0;
        for(int num:nums){
            sum+=num;
        }
        return Optional.of((double) sum / nums.length);
    }
}
