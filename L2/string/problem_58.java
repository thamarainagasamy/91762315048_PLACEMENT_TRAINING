public class problem_58 {
    String str;
    ArrayList<String> sb=new ArrayList<>();
    StringBuilder rb=new StringBuilder();
    public int lengthOfLastWord(String s) {
        str="";
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)==' '){
                if(str!=""){
                  sb.add(str);
                  str="";}
             }
             else{
                str=str+s.charAt(i);
             }
        }if(str!="")sb.add(str);
        str=sb.getLast();
        return str.length();
    }
        
    }