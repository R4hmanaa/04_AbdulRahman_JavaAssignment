import java.util.Scanner;

class ArrayAssignment {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.println("\nEnter Number Of Rows & Columns :-");
        int row = i.nextInt();
        int col = i.nextInt();
        int[][] m = new int[row][col];

        for (int n = 1; n <= 2; n=n+1) {

            System.out.println("Enter Matrix No " + n + " (Row By Row) :");

            for (int i = 0; i < row; i=i+1) {
                System.out.println("Enter values for Row " + (i+1) + " :");
                for (int j = 0; j < col; j++) {
                    m[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matrix " +n+ " is:");
            for (int i = 0; i < row; i=i+1) {
                for (int j = 0; j < col; j=j+1) {
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("for matrix " +n+ " :-");

            for (int i = 0; i < row; i=i+1) {
                int sum = 0;
                for (int j = 0; j < col; j=j+1)
                    sum += m[i][j];
                System.out.println("thesum of Row " + (i+1) + " = " + sum);
            }

            for (int j = 0; j < col;j=j+1) {
                int sum = 0;
                for (int i = 0; i < row; i=i+1)
                    sum += m[i][j];
                System.out.println("the sum of Coloumn " + (j+1) + " = " + sum);
            }

            if (row == col) {
                int i1 = 0, i2 = 0;
                for (int i = 0; i < row; i=i+1) {
                    i1 += m[i][i];
                    i2 += m[i][row - 1 - i];
                }
                System.out.println("the Sum of Forward Diagonal = " + i1);
                System.out.println("the Sum of Reverse Diagonal = " + i2);
            }
        }

      
    }
}
