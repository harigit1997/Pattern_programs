package Patterns;

public class Number_triangle {
    public static void main(String[] args) {
        int i, j;
        int n=4;

        // outer loop to handle rows
        for ( i = 1; i <= n; i++) {

            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
