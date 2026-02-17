public class pattern_3 {
    public void triangle(int n ){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_3 pa  = new pattern_3();
        pa.triangle(5);
    }
}
