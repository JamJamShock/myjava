package Demo;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 54, 5, 4, 4545, 23, 3, 4, 4, 5, 6, 657, 86, 435, 3, 1};

        // sort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
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
    }
}
