import java.util.*;

public class Exo2Inventaire {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // read the line number
        int linenumber = Integer.parseInt(scanner.nextLine());

        // to store the product name and their stock
        HashMap<String,Integer> productStockValue = new HashMap<>();

        /// read each product name and price and update the stock value in the hashMap
        for ( int i = 0 ; i < linenumber ; i++ ) {
            String input = scanner.nextLine();
            String[] line = input.split(" ");
            String productName = line[0];
            int productPrice = Integer.parseInt(line[1]);

            // if the product name exist , update the stock items
            productStockValue.put(productName, productStockValue.getOrDefault(productName, 0) + productPrice);
        }
            // find the maximum stock value
            int maxStockItems = Collections.max( productStockValue.values());

            // collect all the product which has maximum stock value
            ArrayList<String > maxProduct = new ArrayList<>();

            for (Map.Entry<String , Integer > entry : productStockValue.entrySet()){
                if ( entry.getValue() == maxStockItems ){
                    maxProduct.add( entry.getKey() );
                }
            }

            // Sort the products alphabetically
            Collections.sort(maxProduct);

            // Print the result
            System.out.println(String.join(" ", maxProduct));

            scanner.close();


    }

}
