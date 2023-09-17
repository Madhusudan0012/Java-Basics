import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        int n = 10;
        int nst = n;
        int nsp = n - 1; // number of star kuu kaam karna he
        // int n = 5;
        int row = 2 * n - 1;

        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            // Preprtion for the next row

            // nst = nst + 1;
            if (i <= row / 2) {
                nst--;
                nsp--;
            } else {
                nst++;
                nsp++;
            }

        }
    }

}
