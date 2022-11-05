package Demo;

import java.io.BufferedReader;
import java.io.StringReader;

import java.util.Arrays;

import static Demo.BubbleSort.bubbleSort;

public class BinarySearchDemo {
    public static void main(String[] args) {

        int [] arr = {3,6,7,8,5,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int searchNum=5;
        int foundIndex= binarySearch(arr,searchNum);
        if(foundIndex<0){
            System.out.println(searchNum + " is not found ");
        }
        else{
            System.out.println(searchNum + " is found at " + foundIndex);
        }

    }
    public static int binarySearch(int[] arr,int searchNum){

        int hi=arr.length;
        int lo=0;

        while(lo<hi){

            int i=(hi + lo) / 2;

            if(arr[i] == searchNum){
                return i;
            }
            else if( arr[i] < searchNum){
                lo = i+1;
            }
            else {
                hi = i;
            }
        }
        return  -1;
    }
}
