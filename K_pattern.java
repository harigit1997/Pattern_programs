package Patterns;

public class K_pattern {
    public static void main(String[] args) {
        int size= 4;
            for (int i = size; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
            for (int i = 2; i <= size; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
    }
}
