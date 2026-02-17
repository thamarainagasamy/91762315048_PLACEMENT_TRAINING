package leetcode_feb_09;

public class problem_3110 {
public int scoreOfString(String s) {
        int sum = 0;
        int n = s.length();
        for(int i = 1;i<n;i++){
            int v = s.charAt(i)-s.charAt(i-1); 
            if(v < 0){
                sum += (v*(-1));
            }
            else sum += v; 
        }
        return sum;
    }
    public static void main(String[] args) {
        problem_3110 p = new problem_3110();
        System.out.println(p.scoreOfString("hello"));
    }
}
