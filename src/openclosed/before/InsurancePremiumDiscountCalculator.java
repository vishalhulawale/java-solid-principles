/**
 * Earlier, this class was only calculating premium discount for health insurance customers. Now, it has to calculate
 * premium discount for vehicle insurance customers as well. So, I have added a new method to calculate premium
 * discount for vehicle insurance customers. This is a violation of the Open Closed Principle.
 */

package openclosed.before;

public class InsurancePremiumDiscountCalculator {

    public double calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer) {
        if (customer.isLoyalCustomer()) {
            return 20;
        }

        return 0;
    }

    public double calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer) {
        if (customer.isLoyalCustomer()) {
            return 20;
        }

        return 0;
    }

}
