import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        int nst = 5;
        int nsp = 0;
        int row = 5;
        int n = row;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            // nst = nst + 1;
        }
    }

}