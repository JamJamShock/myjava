package Demo;

import java.util.Arrays;

public class FindMini {
    public static void main(String[] args) {
        int [] arr = {7,6,5,14,3};
        int mini = arr[0];
        for(int i = 1; i< arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        System.out.println("Minium: "+ mini);
        /*boolean found=false;
        int j=0;
        while (!found && j !=arr.length){
            found=mini==arr[j];
           j++;
       }
       if(!found){
           System.out.println(mini + " not found ");
       }
       else System.out.println(mini + " is found at: "+ (j-1));*/
        int j=0;
        while(j!=arr.length && arr[j]!=mini){
            j++;
        }
        if(j == arr.length){
            System.out.println(" Nor found ");
        }
        else {
            System.out.println(mini + " is found at " + j);
        }
        int k=1;
        int b=0;
        int num=0;
        while(k< arr.length) {
            num=arr[k];
            b=k;
            while (b>0 && arr[b-1]>num){
                arr[b] = arr[b-1];
                b--;
            }
            arr[b] = num;
            k++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Second largest num: " + arr[arr.length-2]);
    }
}
