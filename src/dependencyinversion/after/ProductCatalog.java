/**
 * ProductCatalog no longer depends on SqlProductRepository instead depends on ProductRepository which is an abstraction
 */

package dependencyinversion.after;

import java.util.List;

public class ProductCatalog {

    public void listAllProducts() {
        ProductRepository repository = ProductFactory.create();
        List<String> productNames = repository.getAllProductNames();
        for (String productName : productNames) {
            System.out.println(productName);
        }
    }

}
