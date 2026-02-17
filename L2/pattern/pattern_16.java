public class pattern_16 {
    public void triangle(int n) {
        char c = 'A';
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j<=i;j++){
                System.out.print(c);
                
            }
            c++;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern_16 pa = new pattern_16();
        pa.triangle(4);
    }
}
