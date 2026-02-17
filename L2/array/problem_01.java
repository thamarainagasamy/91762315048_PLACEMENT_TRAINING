package 91762315048_PLACEMENT_TRAINING.L2.array;

public class problem_01 {
       public int[] twoSum(int[] a, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();
        int []result=new int[2];
        for(int i=0;i<a.length;i++){
            if(map.containsKey(target-a[i])){
                result[0]=map.get(target-a[i]);
                result[1]=i;
                break;
            }
            map.put(a[i],i);
        }return result;
    }
}
