import java.util.Scanner;

public class vowelcounter {

    public static void count(String s) {
        int n = s.length();
        int cv = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cv++;
            }
        }
        System.out.println("Number of vowels in the string: " + cv);
        System.out.println("Number of consonants in the string: " + (n - cv));

    }

    public static void main(String args[]) {
        Scanner sr = new Scanner(System.in);
        String s;
        System.out.print("Enter the string: ");
        s = sr.nextLine();
        System.out.println("String: " + s);
        count(s.toLowerCase());
        sr.close();

    }

}