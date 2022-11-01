/*write a java program of bank account using
constructor. */

class bank {
    int accno;
    String name;
    float bal;
    int age;

    bank(int a, String n, float b, int ag) {
        accno = a;
        name = n;
        bal = b;
        age = ag;
        System.out.println("Welcome to the bank");
    }

    void deposit(float amt) {
        bal = bal + amt;
        System.out.println("Balance after deposit=" + bal);
    }

    void withdraw(float amt) {
        if (amt > bal)
            System.out.println("Insufficient balance");
        else {
            bal = bal - amt;
            System.out.println("Balance after withdraw=" + bal);
        }
    }

    void display() {
        System.out.println("Account no=" + accno);
        System.out.println("Name=" + name);
        System.out.println("Balance=" + bal);
    }

    public static void main(String args[]) {

        bank b1 = new bank(1001, "Raj", 1000, 20);
        System.out.println("deposit ");
        b1.deposit(500);
        System.out.println("Withdraw ");
        b1.withdraw(200);
        System.out.println("Display");

        b1.display();
    }
}
