import java.util.Scanner;

//Question 18 
public class P21 {
    public static void main(String[] args) {
        int n = 7;
        int nst = 1;
        int nsp = n / 2; // number of star kuu kaam karna he
        // int n = 5;
        int row = n;

        for (int i = 1; i <= row; i++) {
            // for (int k = 1; k <= nst; k++) {
            // System.out.print(" ");

            for (int j = 1; j <= nst; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            System.out.println();

            // Preprtion for the next row

            // nst = nst + 1;
            if (i <= row / 2) {
                nst += 2;
                nsp--;

            } else {
                nst -= 2;
                nsp++;

            }

        }
    }
}
