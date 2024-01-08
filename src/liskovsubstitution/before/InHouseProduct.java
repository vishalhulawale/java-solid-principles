package liskovsubstitution.before;

public class InHouseProduct extends Product {

    public void applyExtraDiscounts() {
        discount *= 1.5;
    }

}
