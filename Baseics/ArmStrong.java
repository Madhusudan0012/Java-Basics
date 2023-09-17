//import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int a = 153;

        // int i = 0;
        // int w = 0;

        int nod = 0; // nod is number of digits
        int n = a;
        while (n > 0) {
            nod++;
            n /= 10;

        }
        n = a;
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum = sum + dig * dig * dig;
        }
        if (a == sum) {
            System.out.println("ArmString number ");
        } else {
            System.out.println("Not a ArmString number ");
        }
    }

}
