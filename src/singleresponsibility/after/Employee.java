/**
 * Reason to change this class: Change in employee information
 */

package singleresponsibility.after;

public class Employee {

    private final String id;

    private final String name;

    private final String address;

    private final String contactNumber;

    private final String employeeType;


    public Employee(String id, String name, String address, String contactNumber, String employeeType) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.employeeType = employeeType;
    }

    public void save() {
        new EmployeeRepository().save(this);
    }

    public void calculateTax() {
        new TaxCalculator().calculateTax(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

}
