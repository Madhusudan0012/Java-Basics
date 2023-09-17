import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        int n = 10;
        int nst = 1;
        int nsp = n - 1;
        int row = n;
        for (int i = 1; i <= n; i++) {
            // Space
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");

            }
            for (int j = 1; j < nst; j++) {
                if (j % 2 == 0) {
                    System.out.print("!");
                } else
                    System.out.print("*");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
}