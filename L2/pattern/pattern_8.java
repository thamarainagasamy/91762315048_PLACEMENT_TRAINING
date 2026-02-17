public class pattern_8 {
    public void triangle(int n ){
        int odd = 2*n-1;   
        for(int i =0;i<n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(' ');
            }
            for(int j = 1;j<=odd;j++){
                System.out.print('*');
            }
            System.out.println();
            odd-=2;
        }
    }
    public static void main(String[] args){
        pattern_8 pa  = new pattern_8();
        pa.triangle(5);
    }
}
