package Patterns;

public class Right_pascals {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        // Upper Half
        for(i=1; i<=n;i++)
        {
            for(j=1; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(i=n-1; i>=1;i--)
        {
            for(j=1; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
