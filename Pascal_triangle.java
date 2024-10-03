package Patterns;

public class Pascal_triangle {
    public static void main(String[] args) {
        int i, j, k;
        int n = 4;
        for(i=1;i<=n;i++) {
            for (k = 1; k <= n-i; k++) {
                System.out.print("  ");
            }
            int x = 1;
            for (j = 1; j <= i; j++) {

                // The first value in a line is always 1
                System.out.print(x+"  ");
                x = x * (i - j) / j;
            }

            System.out.println();
        }
    }
}
