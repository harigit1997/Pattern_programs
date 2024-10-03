package Patterns;

public class Reverse_number_triangle {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i<=n; i++) {
//             inner loop to print stars.
            for (j = i ; j <=n; j++)
            {
                if(i==1 || j==n || i==j)
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
            // inner loop to print spaces.
            for (int k=0; k<=i-1; k++) {
                System.out.print(" ");
            }
        }

    }
}
