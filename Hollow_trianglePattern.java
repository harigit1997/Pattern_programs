package Patterns;

public class Hollow_trianglePattern {
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        // outer loop to handle rows
        for (i = 1; i <= n; i++) {

            // inner loop to print spaces.
            for (j = n-1; j >= i; j--) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (j = 1; j <=i; j++)
            {
                if(i==j || j==1 || i==n )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            // printing new line for each row
            System.out.println();
        }
    }
}
