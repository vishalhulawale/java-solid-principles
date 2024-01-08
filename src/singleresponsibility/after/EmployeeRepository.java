/**
 * Reason to change: Change in database
 */

package singleresponsibility.after;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepository {

    public void save(Employee employee) {
        String objectString = employee.getId() + ", " + employee.getName() + ", " + employee.getAddress() + ", " + employee.getContactNumber() + ", " + employee.getEmployeeType();
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

}
