public class pattern_14 {
    public void triangle(int n ){
        
        for(int i =n;i>0;i--){
            char c = 'A';
            for(int j = 0;j<i;j++){
                System.out.print(c+" ");
                c+=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_14 pa  = new pattern_14();
        pa.triangle(5);
    }
}

