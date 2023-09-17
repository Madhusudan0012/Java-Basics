import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int nsp = n + 2;
        int row = n;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print(" ");
            }
            if (i == n) {
                nst--;
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();

            nsp -= 2;
            nst++;
        }
    }

}