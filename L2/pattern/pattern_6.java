public class pattern_6 {
    public void triangle(int n ){
        for(int i =n;i>0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_6 pa  = new pattern_6();
        pa.triangle(5);
    }
}
