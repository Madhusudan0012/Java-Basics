import java.util.Scanner;

import javax.swing.SpinnerDateModel;

//Question 19
public class p24 {
    public static void main(String[] args) {
        int n = 7;
        int nst = n / 2;
        int nsp = 1;
        int row = n;
        for (int i = 1; i <= row; i++) {
            if(i==1|| i==n
                for(mint )
            }
            // Star
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            // Space
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            // sTar
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            System.out.println();
            if (i <= row / 2) {
                nsp += 2;
                nst--;
            } else {
                nsp -= 2;
                nst++;
            }

        }

    }

}
