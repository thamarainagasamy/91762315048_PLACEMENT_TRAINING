public class pattern_18 {
    public void triangle(int n) {
       char c = '@';
       int m = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<m;k++){
                if(k<=i){
                    System.out.print(++c);
                    
                }
                else {System.out.print(--c);}
            }
            m+=2;
            c = '@';
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern_18 pa = new pattern_18();
        pa.triangle(10);
    }
}
