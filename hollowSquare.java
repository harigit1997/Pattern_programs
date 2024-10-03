package Patterns;

public class hollowSquare {
    public static void main(String[] args) {
        int Siz = 4;
        for (int j = 0; j < Siz; j++) {
            for (int i = 0; i < Siz; i++) {
                if (i == 0 || j == 0 || i == Siz-1 || j == Siz-1) {
                    System.out.print("*");
                }
                else
                {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
