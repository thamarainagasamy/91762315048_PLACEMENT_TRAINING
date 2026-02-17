public class problem_345 {
    public String reverseVowels(String s) {
        int i = 0;
        int pass = 0;
        int n = s.length()-1;

        char[] arr = s.toCharArray(); 
        while(i<n){
            char c = s.charAt(i);
            if(!(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||
            c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U')
            ){
                i++;
               
            }
            else pass++;
            c=s.charAt(n);
            if(!(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||
            c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U')
            ){
                n--;
               
            }else pass++; 
            if( pass == 2 ) {
                arr[i] = s.charAt(n);
                arr[n] = s.charAt(i);
                i++;
                n--;
            }
            pass = 0;
        }
        return new String(arr);
    }
}
