import java.util.Scanner;

public class BinaryPartB {

    public static int[] convBinaryArray(int number) {
        int n = number;
        int[] x = new int[32];
        int index = 0;

        while (n > 0) {
            x[index] = n % 2;
            n = n / 2;
            index++;
        }
        int[] ans = new int[index];
        for (int i = 0; i < index; i++) {
            ans[i] = x[index - 1 - i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = inp.nextInt();

        int[] BinaryDig = convBinaryArray(num);

        System.out.print(num + " in binary is = ");
        for (int digit : BinaryDig) {
            System.out.print(digit);
        }
        System.out.println();
        inp.close();
    }
}
