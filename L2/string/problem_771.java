import java.util.HashMap;

public class problem_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int n = stones.length();
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(stones.charAt(i))) map.put(stones.charAt(i),map.get(stones.charAt(i))+1);
            else map.put(stones.charAt(i),1);
        }
        n = jewels.length();
        for(int i = 0;i<n;i++){
            if(map.containsKey(jewels.charAt(i)))
            res+=map.get(jewels.charAt(i));
        }
        return res;
    }   
}
