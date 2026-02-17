public class pattern_13 {
    public void triangle(int n ){
        int m = 1;
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_13 pa  = new pattern_13();
        pa.triangle(5);
    }
}
