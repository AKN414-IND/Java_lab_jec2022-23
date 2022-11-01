import java.util.Scanner;

public class factorial {

    // function to return factorial of a number
    static int fact(int n) {
        int f = 1, i;
        for (i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + fact(n));
    }

}
