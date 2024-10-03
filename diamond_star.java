package Patterns;

public class diamond_star {
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
                System.out.print("* ");
            }
            // printing new line for each row
            System.out.println();
        }
        for (i = n-1; i>0; i--) {

            // inner loop to print outer spaces.
            for (int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }


            // inner loop to print stars.
            for (j = i ; j >=1 ; j--)
            {
                    System.out.print("* ");
            }
            // printing new line for each row
            System.out.println();
        }
    }
}
