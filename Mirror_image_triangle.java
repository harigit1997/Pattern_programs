package Patterns;

public class Mirror_image_triangle {
    public static void main(String[] args) {
        int i, j;
        int n = 4;
        for (i = 1; i<=n; i++) {
            // inner loop to print spaces.
            for (int k=1; k<i; k++) {
                System.out.print(" ");
            }
//             inner loop to print stars.
            for (j = i ; j <=n; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
        for (i = n-1; i > 0; i--) {
            // Inner loop for printing inner spaces
            for (int k = i; k >= 1; k--)
            {
                System.out.print(" ");
            }

//             inner loop to print stars.
            for (j = i; j <= n; j++) {
                System.out.print(j+" ");
            }
            // printing new line for each row
            System.out.println();
            // inner loop to print spaces.

        }
    }
}

