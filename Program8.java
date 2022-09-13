import java.util.Scanner;

public class Program8 {

    public static void main(String args[]) {
        int a = 0, b = 1, c, i;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println("The fibonacci sequence");

        System.out.println(a);
        System.out.println(b);
        for (i = 0; i < l - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

}
