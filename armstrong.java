import java.util.Scanner;;

public class armstrong {
    public int arm(int num) {

        int p = 0;
        while (num > 0) {

            int rem = num % 10;
            p = (p) + (rem * rem * rem);
            num = num / 10;
        }
        return p;
    }

    public static void main(String[] args) {

        int num, p;
        System.out.print("Enter the number :");
        Scanner rScanner = new Scanner(System.in);
        num = rScanner.nextInt();
        int temp = num;

        armstrong obj = new armstrong();
        p = obj.arm(num);

        if (temp == p) {
            System.out.println(num + " is Armstrong Number .");
        } else {
            System.out.println(num + " is not an Armstrong No.");
        }
    }
}