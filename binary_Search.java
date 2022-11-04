import java.util.*;

class binary_Search {
    static void BS(int a[], int n, int e) {
        int high, low = 0, mid;
        low = 0;
        high = n - 1;
        mid = (low + high) / 2;
        while (low <= high) {
            if (a[mid] < e)
                low = mid + 1;
            else if (a[mid] == e) {
                System.out.print(e + " found at " + (mid + 1) + " position. \n");
                break;
            } else
                high = mid - 1;
            mid = (low + high) / 2;
        }
        if (low > high)
            System.out.println("Not found! " + e + " isn't present in the list\n");
    }

    public static void main(String args[]) {
        System.out.print("Enter the number of elements:");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" A[" + i + "]:");
            a[i] = read.nextInt();
        }
        System.out.print("Enter the elements:");
        int e = read.nextInt();
        BS(a, n, e);
        read.close();

    }
}