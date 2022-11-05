package demo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StackDemo obj=new StackDemo(3);
        obj.push(5);
        obj.push(4);
        obj.push(8);
        obj.push(1);
        obj.push(1);
        obj.push(3);
        obj.push(3);

        System.out.println(Arrays.toString(obj.nums));
        System.out.println(obj.pop());
        System.out.println(Arrays.toString(obj.nums));

    }
}
