/**
 * Reason to change this class: Change in employee information
 */

package singleresponsibility.before;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee {

    private String id;

    private String name;

    private String address;

    private String contactNumber;

    private String employeeType;


    public Employee(String id, String name, String address, String contactNumber, String employeeType) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.employeeType = employeeType;
    }

    public void save() {
        String objectString = "id: " + id + ", name: " + name + ", address: " + address + ", contactNumber: " + contactNumber + ", employeeType: " + employeeType;
        System.out.println("Saving employee: " + objectString);
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");
            statement = connection.createStatement();
            statement.execute("INSERT INTO Employee VALUES (" + objectString + "')");
        } catch (Exception e) {
            System.out.println("Error saving employee: " + objectString);
        }
    }

    public void calculateTax() {
        if (employeeType.equals("fulltime")) {
            System.out.println("Calculating tax for fulltime employee...");
        } else if (employeeType.equals("contractor")) {
            System.out.println("Calculating tax for contractor...");
        } else if (employeeType.equals("parttime")) {
            System.out.println("Calculating tax for parttime employee...");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

}
