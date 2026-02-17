package 91762315048_PLACEMENT_TRAINING.L2.array;

public class problem_448 {
     public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>(); 
        for(int i : nums){
            set.add(i);
        }
        for(int i = 1;i<=n;i++){
                if(!set.contains(i)) res.add(i);
        }
        return res;
    }   
}
