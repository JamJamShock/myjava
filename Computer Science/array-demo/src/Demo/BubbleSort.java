package Demo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 2, 3, 7, 2, 8, 93, 456};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int i = 0;
        int temp = 0;

        while (i < arr.length) {
            int j = 1;
            while (j < arr.length) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i--;
        }
    }
}
