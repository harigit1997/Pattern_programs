package Patterns;

public class Palindrome_triangular {
    public static void main(String[] args) {
        int i, j, k;
        int n = 4;
        for(i=1;i<=n;i++)
        {
            for(k=n-i;k>=1;k--)
            {
                System.out.print("  ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
