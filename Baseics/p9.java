import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        int nst = 1;
        int nsp = 0;
        int row = 6;
        int n = row;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            nst = nst + 1;
        }
    }

}