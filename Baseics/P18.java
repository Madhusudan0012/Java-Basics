import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        int n  = 5;
        int nst = n;
        int nsp = 0; // number of star kuu kaam karna he
        //int n = 5;
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
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }

        }
    }

}
