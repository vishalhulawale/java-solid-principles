/**
 * Overriding get discount method in InHouseProduct class to apply extra discounts helped us to remove the instanceof check in PricingUtils class.
 */
package liskovsubstitution.after;

import java.util.List;

public class PricingUtils {

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product3 = new Product();
        InHouseProduct product2 = new InHouseProduct();

        List<Product> products = List.of(product1, product2, product3);

        for (Product product : products) {
            System.out.println(product.getDiscount());
        }
    }

}
