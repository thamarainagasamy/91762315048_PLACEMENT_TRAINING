class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        
        int m = s.length();
        int n = t.length();
        if (m != n)
            return false;
        for (int i = 0; i < m; i++) {
            if (map1.containsKey(s.charAt(i)))
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            else
                map1.put(s.charAt(i), 1);
        }
        for (int i = 0; i < n; i++) {
            if (map1.containsKey(t.charAt(i)))
                map1.put(t.charAt(i), map1.get(t.charAt(i)) - 1);
            else
            return false;
                
        }
        for(char c : map1.keySet()){
            if(map1.get(c) > 0)
                    return false;
            }
            return true;
    }
}