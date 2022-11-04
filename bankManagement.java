import java.util.Scanner;

public class bankManagement {

    /* creat a contruct bankManagement */
    bankManagement() {
        System.out.println("Welcome to the bank management system!");
        String name = " ";
        String password = " ";
        int balance = 0;
        int option = 0;
        int amount = 0;

    }

    /* creat a method to show the menu */
    public void showMenu() {
        System.out.println(
                "1. Create an account \n 2. Check the balance \n3. Deposit\n 4. Withdraw\n5. Exit\n Please enter your choice: ");
    }

    /* creat a method to create an account */
    public void createAccount() {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Please enter your password: ");
        String password = input.next();
        System.out.println("Please enter your balance: ");
        double balance = input.nextDouble();
        System.out.println("Please enter your phone number: ");
        String phone = input.next();
        System.out.println("Please enter your address: ");
        String address = input.next();
    }

    /* creat a method to check the balance */
    public void checkBalance() {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Please enter your password: ");
        String password = input.next();
        System.out.println("Your balance is: ");
    }

    /* creat a method to deposit */
    public void deposit() {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Please enter your password: ");
        String password = input.next();
        System.out.println("Please enter the amount you want to deposit: ");
        double deposit = input.nextDouble();
        System.out.println("Your balance is: ");
    }

    /* creat a method to withdraw */
    public void withdraw() {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Please enter your password: ");
        String password = input.next();
        System.out.println("Please enter the amount you want to withdraw: ");
        double withdraw = input.nextDouble();
        System.out.println("Your balance is: ");
    }

    /* creat a method to exit */
    public void exit() {
        System.out.println("Thank you for using the bank management system!");
    }

    public static void main(String[] args) {
        bankManagement bank = new bankManagement();
        bank.showMenu();
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch (option) {
            case 1:
                bank.createAccount();
                break;
            case 2:
                bank.checkBalance();
                break;
            case 3:
                bank.deposit();
                break;
            case 4:
                bank.withdraw();
                break;
            case 5:
                bank.exit();
                break;
            default:
                System.out.println("Invalid input!");
        }

    }

}
