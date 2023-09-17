import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {

        int n = 5;
        int nst = 5;
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