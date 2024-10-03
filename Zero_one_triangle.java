package Patterns;

public class Zero_one_triangle {
    public static void main(String[] args) {
        int n=4; //size fixed at 4
        for(int i=1; i<=n;i++) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" "); //printing j elements
            }
            System.out.println();
        }
    }
}
