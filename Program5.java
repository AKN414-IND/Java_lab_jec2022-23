public class Program5 {
    public static void main(String args[]) {
        int a = 0, b = 1, c, i, l = 10;
        System.out.println("The fibonacci sequence");

        System.out.print(a);
        System.out.print("," + b);
        for (i = 2; i < l; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print("," + c);
        }
    }

}
