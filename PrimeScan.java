import java.util.Scanner;

public class PrimeScan {
    public static void main(String args[]) {
        int i, f = 0;
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                f = 1;
            } else {
                break;
            }
        }
        if (f == 1) {
            System.out.println("The number " + num + " is not prime ");
        } else {
            System.out.println("The number " + num + " is prime ");
        }
    }
}
