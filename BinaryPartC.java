import java.util.Scanner;

public class BinaryPartC {
    public static String convBinaryString(int number) {
        int n = number;
        int[] x = new int[32];
        int index = 0;

        while (n > 0) {
            x[index] = n % 2;
            n = n / 2;
            index++;
        }
        String ans = "";
        for (int i = index - 1; i >= 0; i--) {
            ans = ans + x[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = inp.nextInt();

        String binary = convBinaryString(num);
        System.out.println(num + " in binary = " + binary);
        inp.close();
        
    }
}
