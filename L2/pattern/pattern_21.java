public class pattern_21 {
    public void triangle(int n ){
        int m = 2*n-1;
        for(int i =0;i<m;i++){
            for(int j = 0;j<m;j++){
                int top = i;
                int left = j;
                int right = m-1-j;
                int bottom = m-1-i;
                int distance = Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print((n-distance)+" ");   
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_21 pa  = new pattern_21();
        pa.triangle(5);
    }
}

