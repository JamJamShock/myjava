package Demo;

public class BoundedLinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,3,6,7,8};
        int i = 0;
        int x = 9;
        boolean found = false;

        while (!found && i != arr.length){
            found = arr[i] == x;
            i++;
        }

        if(!found){
            System.out.println(x + " Not Found ");
        }
        else{
            System.out.println(x + " Found at " + (i-1));
        }
    }
}
