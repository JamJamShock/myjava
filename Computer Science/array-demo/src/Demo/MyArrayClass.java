package Demo;

public class MyArrayClass {
    public static void main(String[] args) {
        int [] arr = {4,6,1,6,8,4,8};
        int max = arr[0];
        int i = 1;

        while(i<arr.length) {
            if(arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        System.out.println("Max : " + max);

        int mini = arr[0];
        int j = 1;

        while(j<arr.length){
            if(arr[j]<mini){
                mini = arr[j];
            }
            j++;
        }
        System.out.println("Mini : " + mini);
    }
}
