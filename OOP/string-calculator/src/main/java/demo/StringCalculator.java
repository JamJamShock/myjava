package demo;

public class StringCalculator {

    public int add(String input){
            return sum(removeDelimiter(input));
    }

    public String[] removeDelimiter(String input){
        if(input.contains(",")){
            return input.split(",|\n");
        }
        return new String[]{input};
    }

    private int sum(String[] nums) {
        int sum=0;
        for(int i = 0; i< nums.length; i++){
            throwsExceptionWithNegativeNum(nums[i]);
            if(toInt(nums[i])<1000){
                sum+= toInt(nums[i]);
            }
        }
        return sum;
    }

    private int toInt(String input) {
        if(input.isEmpty()){
            return 0;
        }
        return Integer.parseInt(input);
    }

    private void throwsExceptionWithNegativeNum(String input) {
        if(toInt(input)<0){
            throw new RuntimeException("Negative numbers not allowed : "+ input);
        }
    }
}
