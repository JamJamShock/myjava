package Demo;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2,6,3,7,8,5};
        int i = 0;
        int searchNum = 9;
        while(i!=arr.length && arr[i]!=searchNum){
            i++;
        }

        if(i==arr.length){
            System.out.println(searchNum + " Not Found ");
        }
        else{
            System.out.println(searchNum + " Found at " + i);
        }
    }
}
