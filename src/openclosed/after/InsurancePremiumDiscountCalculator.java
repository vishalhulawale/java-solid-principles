/**
 * To support new insurance products, we need to create new classes that implement the CustomerProfile interface.
 * So that we can add new insurance products without modifying the existing code.
 * This is an example of Open Closed Principle.
 */

package openclosed.after;

public class InsurancePremiumDiscountCalculator {

    public double calculatePremiumDiscountPercent(CustomerProfile customer) {
        if (customer.isLoyalCustomer()) {
            return 20;
        }

        return 0;
    }

}
