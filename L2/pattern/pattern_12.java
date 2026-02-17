public class pattern_12 {
    public void triangle(int n ){
        for(int i =n;i>0;i--){
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_13 pa  = new pattern_13();
        pa.triangle(5);
    }
}
