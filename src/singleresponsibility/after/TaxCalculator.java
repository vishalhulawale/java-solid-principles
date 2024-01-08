/**
 * Reasons for change: Change in tax calculation logic
 */

package singleresponsibility.after;

public class TaxCalculator {

    public void calculateTax(Employee employee) {
        if (employee.getEmployeeType().equals("fulltime")) {
            System.out.println("Calculating tax for fulltime employee...");
        } else if (employee.getEmployeeType().equals("contractor")) {
            System.out.println("Calculating tax for contractor...");
        } else if (employee.getEmployeeType().equals("parttime")) {
            System.out.println("Calculating tax for parttime employee...");
        }
    }

}
