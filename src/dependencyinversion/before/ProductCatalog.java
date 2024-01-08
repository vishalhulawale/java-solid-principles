/**
 * ProductCatalog which is high level module depends on low level module SqlProductRepository
 * ProductCatalog is tightly coupled with SqlProductRepository
 * If we want to change SqlProductRepository to OracleProductRepository, we need to change ProductCatalog
 * This is a violation of Dependency Inversion Principle
 */

package dependencyinversion.before;

import java.util.List;

public class ProductCatalog {

    public void listAllProducts() {
        SqlProductRepository repository = new SqlProductRepository();
        List<String> productNames = repository.getAllProductNames();
        for (String productName : productNames) {
            System.out.println(productName);
        }
    }

}
