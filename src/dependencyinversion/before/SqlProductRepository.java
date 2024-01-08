package dependencyinversion.before;

import java.util.Arrays;
import java.util.List;

public class SqlProductRepository {

    public List<String> getAllProductNames() {
        return Arrays.asList("Alpha", "Beta", "Gamma");
    }

}
