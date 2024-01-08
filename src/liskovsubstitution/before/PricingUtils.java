/**
 * We had to check if the product is an instance of InHouseProduct before applying extra discounts.
 * This is a violation of the Liskov Substitution Principle.
 */

package liskovsubstitution.before;

import java.util.List;

public class PricingUtils {

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product3 = new Product();
        InHouseProduct product2 = new InHouseProduct();

        List<Product> products = List.of(product1, product2, product3);

        for (Product product : products) {
            if (product instanceof InHouseProduct) {
                ((InHouseProduct) product).applyExtraDiscounts();
            }

            System.out.println(product.getDiscount());
        }
    }

}
