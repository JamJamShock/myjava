package Demo;

public class Clock {
    public static void main(String[] args) {
        int k=0;
        int i=0;
        int j=0;
        for (k=0;k<=23;k++){
            for (i=0;i<=59;i++){
                for (j=0;j<=59;j++){
                    System.out.println(k + "hours" + i + "minutes" + j + "seconds");
                }
            }
        }
    }
}
