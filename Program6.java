import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("the number is Even");
        } else {
            System.out.println("the number is Odd");
        }

    }

}
