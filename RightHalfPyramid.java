package Patterns;

public class RightHalfPyramid{
    public static void main(String[] args) {
        int i, j;
        int n=4;

        // outer loop to handle rows
        for (i = n; i >= 1; i--) {

            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (j = 0; j <= n - i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }

    }
