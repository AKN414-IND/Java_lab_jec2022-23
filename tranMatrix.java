import java.util.Scanner;

public class tranMatrix {
    static void transpose(int n, int m, int A[][]) {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < m; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }

    }

    static void printM(int n, int m, int A[][]) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(A[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, m;
        n = read.nextInt();
        m = read.nextInt();
        int A[][] = new int[n][m];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" A[" + i + "][" + j + "] :");
                A[i][j] = read.nextInt();
            }
        }
        System.out.print("matrix is \n");
        printM(n, m, A);
        transpose(n, m, A);
        System.out.print("transpose matrix is \n");
        printM(n, m, A);
        read.close();

    }

}