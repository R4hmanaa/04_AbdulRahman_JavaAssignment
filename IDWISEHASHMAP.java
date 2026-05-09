import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class IDWISEHASHMAP {
    public static void main(String[] args) {
        File F1 = new File("C:\\Users\\Abdul Rahman\\Downloads\\SalesEVESession.txt");
        Scanner inp;
        String d;
        HashMap<String, Double> hm = new HashMap<>();

        try {
            inp = new Scanner(F1);
            d = inp.nextLine(); // skip header
            System.out.println(d);

            String[] parts;
            String repID;
            double qty, uPrice, amt;

            while (d.length() > 0) {
                d = inp.nextLine();
                System.out.println(d);
                parts  = d.split("\t");
                uPrice = Double.parseDouble(parts[2]);
                qty    = Double.parseDouble(parts[3]);
                repID  = parts[5];
                amt    = qty * uPrice;

                if (hm.containsKey(repID)) {
                    amt += hm.get(repID);
                }
                hm.put(repID, amt);
            }
        } catch (Exception e) {
            System.out.println("                      End of file / error                  ");
        } finally {
            System.out.println("\n=== Rep ID-wise Sales Total ===");
            for (Map.Entry<String, Double> me : hm.entrySet()) {
                System.out.println(me.getKey() + " --- " + me.getValue());
            }
        }
    }
}
