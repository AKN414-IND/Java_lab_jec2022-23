import java.util.Scanner;

public class wordFre {
    static int Count(String str, char ch) {
        int c = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {

            if (str.charAt(i) == ch) {

                c++;

            }
        }
        return c;
    }

    // Driver program to test above
    public static void main(String args[]) {
        System.out.println("Enter the String : ");
        String s;
        Scanner read = new Scanner(System.in);
        s = read.nextLine();
        System.out.println("Enter the character  : ");
        char c = read.next().charAt(0);
        read.close();

        System.out.println("frequency of char in string is " + Count(s, c));

    }
}
