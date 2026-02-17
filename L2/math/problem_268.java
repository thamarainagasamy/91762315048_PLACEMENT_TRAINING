package 91762315048_PLACEMENT_TRAINING.L2.math;

public class problem_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n*(n+1))/2;
        int sum = 0;
        for(int i : nums){
           sum += i;     
        }
        return total - sum;
    }
}
