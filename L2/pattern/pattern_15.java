public class pattern_15 {
    public void triangle(int n) {
        
        for(int i = n-1;i>=0;i--){
            char c = 'A';
            for(int j = 0 ;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern_15 pa = new pattern_15();
        pa.triangle(4);
    }
}
