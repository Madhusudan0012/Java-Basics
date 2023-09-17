import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        int nst = 1;
        int nsp = 0;
        int n = 5;
        int row = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            // Preprtion for the next row

            // nst = nst + 1;
            if (i <= row / 2) {
                nst++;
            } else {
                nst--;
            }

        }
    }

}
