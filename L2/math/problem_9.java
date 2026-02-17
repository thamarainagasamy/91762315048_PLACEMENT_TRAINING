public class problem_1518 {
public boolean isPalindrome(int n) {
        int i=0,j=String.valueOf(n).length()-1;
        while(i<j){
            if(String.valueOf(n).charAt(i)!=String.valueOf(n).charAt(j))return false;
            i++;
            j--;
        }
        return true;
        
    }
}