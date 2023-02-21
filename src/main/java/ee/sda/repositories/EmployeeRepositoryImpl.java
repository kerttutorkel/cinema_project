package ee.sda.repositories;

import ee.sda.DatabaseUtils;
import ee.sda.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/humanresources"; //JDBC URL
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "Nomansland22";
    private static DatabaseUtils database = new DatabaseUtils();

    @Override
    public List<Employee> findAll() throws SQLException {
        Connection conn = database.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        List<Employee> employees = new ArrayList<>();

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees");

            while(rs.next()) {
                Integer employeeId = rs.getInt("employeeId");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                Date dateOfBirth = rs.getDate("dateOfBirth");
                employees.add(new Employee()
                        .setEmployeeId(employeeId)
                        .setLastName(lastName)
                        .setFirstName(firstName));
            }
            return employees;
    }
}
