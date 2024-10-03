package Patterns;

public class Number_increasing_triangle_reverse {
    public static void main(String[] args) {
        int n=4; //size fixed at 4
        for(int i=4; i>0;i--) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" "); //printing j elements
            }
            System.out.println();
        }
    }
}
