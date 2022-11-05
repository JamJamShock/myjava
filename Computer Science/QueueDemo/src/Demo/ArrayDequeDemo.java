package Demo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.add(5);
        ad.add(2);
        ad.add(8);
        ad.add(6);

        System.out.println(ad);
        System.out.println("Remove:" + ad.remove());
    }
}
