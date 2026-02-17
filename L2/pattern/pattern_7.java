public class pattern_7 {
    public void triangle(int n ){
        int odd = 1;   
        for(int i =n-1;i>=0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(' ');
            }
            for(int j = 1;j<=odd;j++){
                System.out.print('*');
            }
            System.out.println();
            odd+=2;
        }
    }
    public static void main(String[] args){
        pattern_7 pa  = new pattern_7();
        pa.triangle(5);
    }
}
