package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOne {
    public static void main(String[] args) throws IOException {
        BufferedReader put=new BufferedReader(new InputStreamReader(System.in));
        int [] arr;

        System.out.println("Enter number : ");
        arr=Integer.parseInt(put.readLine());
    }
}
