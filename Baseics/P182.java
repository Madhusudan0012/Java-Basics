import java.util.Scanner;

public class P182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int nst = 5;
        int nsp = 0;
        int row = n;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("*");
            }
            System.out.println();
            nst++;
            nsp--;

        }

    }

}
