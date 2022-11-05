package demo;

public class PrivateSchoolTuition {
    public static void main(String[] args) {
        int i = 0;
        int tuition = 0;
        int grade = 8;
        int month = 9;
        int classroom = 3;
        int kgTuition = 80;
        int otherTuition = 60;

        while (i <= grade) {
            if (i == 0) {
                tuition = kgTuition;
            } else {
                tuition = i * otherTuition;
            }
            int j = 1;
            while (j <= classroom) {
                int k = 1;
                while (k <= month) {
                    System.out.println("Grade : " + i + " Class : " + j + " Month : " + k + " Tuition : " + tuition);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}
