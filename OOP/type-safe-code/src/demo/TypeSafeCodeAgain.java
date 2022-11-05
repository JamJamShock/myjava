package demo;

import java.util.ArrayList;
import java.util.List;

public class TypeSafeCodeAgain {
    public static void main(String[] args) {
        List<Integer> il=new ArrayList<>();
        List ol=il;

        il.add(4);
        ol.add("Java");
        Integer num= il.get(1);
    }
}
