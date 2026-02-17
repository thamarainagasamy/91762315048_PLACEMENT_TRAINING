public class pattern_2 {
    public void triangle(int n ){
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_2 pa  = new pattern_2();
        pa.triangle(5);
    }
}
