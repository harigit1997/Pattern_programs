package Patterns;

public class Triangular_Star {
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        // outer loop to handle rows
        for (i = n; i >= 0; i--) {

            // inner loop to print spaces.
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.


            for (j = 1; j <= n - i; j++) {
//                if(i == j || i == 1 && i!= 5)
//                {
//                    System.out.print(j+" ");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
                System.out.print(j+" ");
            }


            // printing new line for each row
            System.out.println();
        }
//        for (i = n-1; i>0; i--) {
//
//            // inner loop to print spaces.
//            for (int k=1; k<=n-i; k++) {
//                System.out.print(" ");
//            }
//
//
//            // inner loop to print stars.
//            for (j = i ; j >=1 ; j--) {
//                System.out.print("* ");
//            }
//            // printing new line for each row
//            System.out.println();
        }
    }
