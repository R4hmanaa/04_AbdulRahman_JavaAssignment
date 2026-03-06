import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimension of the square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                a[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < n; r++) {
            int sum = 0;
            for (int c = 0; c < n; c++) {
                sum += a[r][c];
            }
            System.out.println("Sum of row " + (r + 1) + ": " + sum);
        }

        for (int c = 0; c < n; c++) {
            int sum = 0;
            for (int r = 0; r < n; r++) {
                sum += a[r][c];
            }
            System.out.println("Sum of column " + (c + 1) + ": " + sum);
        }

        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < n; i++) {
            d1 += a[i][i];
            d2 += a[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal: " + d1);
        System.out.println("Sum of reverse diagonal: " + d2);

        sc.close();
    }
}
