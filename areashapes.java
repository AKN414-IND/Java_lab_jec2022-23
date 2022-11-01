import java.util.*;

class areashapes {
    void area(int x, int y, int z) {
        System.out.println("the area of the triangle is " + (0.5 * x * y) + " sq units");
    }

    void area(float x, float y) {
        System.out.println("the area of the rectangle is " + x * y + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is " + z + " sq units");
    }
}

class Overload {
    public static void main(String args[]) {
        areashapes ob = new areashapes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Triangle:");
        int b = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();
        ob.area(b, h, l);

        System.out.println("Enter the side of rectangle:");
        int s = sc.nextInt();
        int t = sc.nextInt();
        ob.area(s, t);

        System.out.println("Enter the radius of circle:");
        int r = sc.nextInt();
        ob.area(r);
    }
}
