import java.util.Scanner;

public class Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        if(n>=90){
            System.out.println("A");
        }
        elif(n>=80){
            System.out.println("B");

        }
        elif(n>=70){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}