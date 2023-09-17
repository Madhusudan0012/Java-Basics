import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 0;
        int nsp = n - 1;

        int row = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            // For Star
            for (int j = 1; j <= nst; j++) {
                System.out.println("*");
            }
            // Preprtion for the next row\Sout
            System.out.println();

            // nst = nst + 1;
            if (i <= row / 2) {
                nst++;
            } else {
                nst--;
            }

        }
    }

}
