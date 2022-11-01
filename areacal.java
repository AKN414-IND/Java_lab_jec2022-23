
/*write a java program to calculate the area of different shapes namely
circle, rectangle, and triangle using the concept of method overloading */
import java.util.Scanner;

class areacal {
    static double area(double r) {
        double a = 3.14 * r * r;
        return a;
    }

    static double area(double l, double b) {
        double a = l * b;
        return a;
    }

    static double area(double b, double h, double c) {
        double a = 0.5 * b * h;
        return a;
    }

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("circle =1 \n rectangle =4 \n circle = 1 \nEnter number of sides : ");
        int n = read.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter radius:");
                double r = read.nextDouble();
                System.out.println("Area of circle=" + area(r));
                break;
            case 4:
                System.out.println("Enter length and breadth:");
                double l = read.nextDouble();
                double b = read.nextDouble();
                System.out.println("Area of rectangle=" + area(l, b));
                break;
            case 3:
                System.out.println("Enter base and height:");
                double base = read.nextDouble();
                double height = read.nextDouble();
                System.out.println("Area of triangle=" + area(base, height, 0));
                break;
            default:
                System.out.println("Invalid input");
        }
        read.close();
    }
}
