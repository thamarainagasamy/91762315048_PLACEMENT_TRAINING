public class pattern_11 {
    public void triangle(int n ){
        int num = 1;
        for(int i =0;i<n;i++){
             num =(i%2 ==0)?1:0;  
            for(int j =0;j<=i;j++){
                System.out.print(num);
                num = num==1?0:1; 
            }
            System.out.println();
           
        }  
    }
    public static void main(String[] args){
        pattern_11 pa  = new pattern_11();
        pa.triangle(5);
    }
}
