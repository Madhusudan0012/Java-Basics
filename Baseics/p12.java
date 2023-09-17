import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {

        int n = 5;
        int nst = 2 * n - 1;
        int nsp = 0;

        int row = n;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            // System.out.print(' ');

            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }

            System.out.println();
            nsp++;
            nst -= 2;
        }

    }
}