public class pattern_4 {
    public void triangle(int n ){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_4 pa  = new pattern_4();
        pa.triangle(5);
    }
}
