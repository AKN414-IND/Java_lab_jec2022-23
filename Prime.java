public class Prime {
    public static void main(String args[]) {
        int i, f = 0, num = 5;

        for (i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                f = 1;
            } else {
                break;
            }
        }
        if (f == 1) {
            System.out.println("The number " + num + " is not prime ");
        } else {
            System.out.println("The number " + num + " is prime ");
        }
    }
}
