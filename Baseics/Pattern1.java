import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        // int nst = 1; number of Star
        // int nsp = 0; number of Space
        // int num = n ; Stand for number of rows
        // Average Student have no Place in the india and and world also
        int n = 5;
        int nst = 1;
        int nsp = 0;
        int row = n;

        for (int i = 1; i <= row; i++) {
            // Star
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            nst = nst + 1;
        }
    }
}