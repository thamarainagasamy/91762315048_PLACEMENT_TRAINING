package leetcode_feb_09;

public class problem_1108 {
    public String defangIPaddr(String address) {
        String result = "";
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                result += "[" + address.charAt(i) + "]";
            }
            else{
                result += "" + address.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        problem_1108 p = new problem_1108();
        System.out.println(p.defangIPaddr("1.1.1.1"));
    }
}
