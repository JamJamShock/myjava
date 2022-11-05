package Demo;

import java.util.Arrays;

public class EventNumber {
    public static void main(String[] args) {
        int [] arr = new int [51];
        int j = 0;
        for (int i=0;i<=100;i++){
            if (i%2 == 0) {
                arr[j++]=i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
