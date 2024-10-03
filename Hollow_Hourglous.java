package Patterns;

public class Hollow_Hourglous {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for (i = n; i>0; i--) {

            // inner loop to print outer spaces.
            for (int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }


            // inner loop to print stars.
            for (j = i ; j >=1 ; j--)
            {
                if(i==n || j==1 || i==j)
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
        for (i = 2; i <= n; i++) {

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
