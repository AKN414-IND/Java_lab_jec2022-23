import java.util.Scanner;

public class Employee {
    static void display() {
        System.out.println("name of class is Employee");
    }

    void calcSalary(float Sal) {
        System.out.println("salary of employee is " + Sal);
    }
}

class Engineer extends Employee {
    public static void main(String[] args) {
        display();
        System.out.println("Enter the  Salary:");
        Scanner read = new Scanner(System.in);
        float sal = read.nextFloat();
        Employee obj = new Employee();
        obj.calcSalary(sal);
        read.close();

    }

}
