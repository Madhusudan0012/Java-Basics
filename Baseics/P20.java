import java.util.Scanner;

//Question 17 
public class P20 {
    public static void main(String[] args) {
        int n = 7;
        int nst = n / 2;
        int nsp = 0; // number of star kuu kaam karna he
        // int n = 5;
        int row = n;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= nst; k++) {
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
