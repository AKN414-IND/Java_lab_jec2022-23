import java.util.Scanner;

abstract class easy {
    public static void print(String s) {
        System.out.print(s);
    }
}

class ab extends easy {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        print("Enter the String:");
        String s = read.nextLine();
        print("string is :");
        print(s);
        read.close();
    }
}
