public class pattern_20 {
    public void triangle(int n) {
        int m = n * 2;
        for (int i = n-1; i >=0; i--) {
            for (int j = 0; j < m; j++) {
                if (j <= i || j >= (m - 1 - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j <= i || j >= (m - 1 - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_20 pa = new pattern_20();
        pa.triangle(4);
    }
}
