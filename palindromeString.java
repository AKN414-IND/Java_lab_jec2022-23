import java.util.Scanner;

class palindromeString {
    public static void pal() {
        // program to check if a string is palindrome or not
        String s = "";
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        original = in.nextLine();
        int length = original.length();
        int a;

        for (a = length - 1; a >= 0; a--) {
            reverse = reverse + original.charAt(a);
        }
        int c;
        for (c = 0; c < length; c++) {
            if (original.charAt(c) == reverse.charAt(c)) {
                s = "palindrome";
            } else {
                s = "not palindrome";
                break;
            }
        }
        System.out.println(s);

    }

    public static void main(String args[]) {
        System.out.println("Enter the string");
        pal();

    }
}
