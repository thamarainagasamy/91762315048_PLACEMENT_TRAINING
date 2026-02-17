public class pattern_1{
    public void square_pattern(int n){
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args){
        pattern_1 pa = new pattern_1();
        pa.square_pattern(4);

    }
}