package liskovsubstitution.after;

public class InHouseProduct extends Product {

    @Override
    public double getDiscount() {
        this.applyExtraDiscounts();
        return discount;
    }

    private void applyExtraDiscounts() {
        discount *= 1.5;
    }

}
