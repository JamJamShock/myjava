package demo;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.push(2);
        ad.push(6);
        ad.push(5);
        ad.push(3);
        ad.push(8);

        System.out.println(ad);
        System.out.println("Pop : " + ad.pop());

        System.out.println(ad);
        System.out.println("Peek : " + ad.peek());
    }
}
