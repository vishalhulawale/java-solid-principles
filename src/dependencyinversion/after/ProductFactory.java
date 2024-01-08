package dependencyinversion.after;

public class ProductFactory {

    public static ProductRepository create() {
        return new SqlProductRepository();
    }

}
