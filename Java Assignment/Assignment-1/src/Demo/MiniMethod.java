package Demo;

import java.util.Arrays;

public class MiniMethod {
    public static void main(String[] args) {

        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        int i = 1;
        int j = 0;
        int num = 0;
        while (i < arr.length) {
            num = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > num) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = num;
            i++;
        }

        System.out.println(arr[0]);
    }
}
