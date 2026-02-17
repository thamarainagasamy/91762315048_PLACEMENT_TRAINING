public class pattern_19 {
    public void triangle(int n) {
        int m = n * 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j <= i || j >= (m - 1 - i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
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
        pattern_19 pa = new pattern_19();
        pa.triangle(4);
    }
}
