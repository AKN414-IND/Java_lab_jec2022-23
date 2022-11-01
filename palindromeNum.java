import java.util.Scanner;

class palindromeNum {
    public static String pal(int n) {
        int temp = n, rem, rev = 0;
        String s = "";
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        if (temp == rev) {
            s = "palindrome";
            return s;
        } else {
            s = "not palindrome";
            return s;
        }

    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("the number is " + pal(n));
    }
}
