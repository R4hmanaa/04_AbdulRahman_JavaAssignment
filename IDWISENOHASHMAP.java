import java.util.Scanner;
import java.io.File;

public class IDWISENOHASHMAP {
    public static void main(String[] args) {
        File F1 = new File("C:\\Users\\Abdul Rahman\\Downloads\\SalesEVESession.txt");
        Scanner inp;
        String d;

        String[] ID = {"E011", "E012", "E013", "E014"};
        double[] total = {0, 0, 0, 0};

        try {
            inp = new Scanner(F1);
            d = inp.nextLine();
            System.out.println(d);

            String[] parts;
            String repID;
            double quantity, unitprice, amount;

            while (d.length() > 0) {
                d = inp.nextLine();
                System.out.println(d);
                parts  = d.split("\t");
                unitprice = Double.parseDouble(parts[2]);
                quantity    = Double.parseDouble(parts[3]);
                repID  = parts[5];
                amount    = quantity * unitprice;

                for (int i = 0; i < ID.length; i++) {
                    if (ID[i].equals(repID)) {
                        total[i] += amount;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("                  End of file / error                ");
        } finally {
            System.out.println("\n=== Rep ID-wise Sales Total ===");
            for (int i = 0; i < ID.length; i++) {
                System.out.println(ID[i] + " --- " + total[i]);
            }
        }
    }
}
