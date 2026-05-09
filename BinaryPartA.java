import java.util.Scanner;

public class BinaryPartA {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = inp.nextInt();

        int num = n;
        int[] bits = new int[32];
        int index = 0;

        while (num > 0) {
            bits[index] = num % 2;
            num = num / 2;
            index++;
        }

        System.out.print(n + " in binary is = ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(bits[i]);
        }
        System.out.println();
        inp.close();

    }
}
