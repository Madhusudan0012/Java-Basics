import java.util.Scanner;

public class ModuloOpertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = 0;
        // Logic Part
        while (n > 0) {
            w = n % 10;
            // System.out.println(w);
            n /= 10; // divide by 20 find the digits
            System.out.println(w);

        }

    }
}
/*
 * Pseudo code
 * int dig = a%10
 * Sout(digits)
 * a /= 10;
 */
