import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class PRODUCTWISEHASHMAP {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Abdul Rahman\\Downloads\\SalesEVESession.txt");
        Scanner inp;
        String dl;
        HashMap<String, Double> hm = new HashMap<>();

        try {
            inp = new Scanner(f1);
            dl = inp.nextLine(); // skip header
            System.out.println(dl);

            String[] parts;
            String prodName;
            double qty, uPrice, amt;

            while (dl.length() > 0) {
                dl = inp.nextLine();
                System.out.println(dl);
                parts    = dl.split("\t");
                prodName = parts[1];
                uPrice   = Double.parseDouble(parts[2]);
                qty      = Double.parseDouble(parts[3]);
                amt      = qty * uPrice;

                if (hm.containsKey(prodName)) {
                    amt += hm.get(prodName);
                }
                hm.put(prodName, amt);
            }
        } catch (Exception e) {
            System.out.println("--- End of file / error ---");
        } finally {
            System.out.println("\n=== Product-wise Sales Total ===");
            for (Map.Entry<String, Double> me : hm.entrySet()) {
                System.out.println(me.getKey() + " --- " + me.getValue());
            }
        }
    }
}
