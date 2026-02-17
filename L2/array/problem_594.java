package 91762315048_PLACEMENT_TRAINING.L2.array;

public class problem_594 {
     public int findLHS(int[] nums) {
        int n = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        } 
        for(int i : map.keySet()){
            
            if(map.containsKey(i+1)) {int m = map.get(i)+map.get(i+1);
            if(n<m)n = m;}

        }
        return n;
    }
}
