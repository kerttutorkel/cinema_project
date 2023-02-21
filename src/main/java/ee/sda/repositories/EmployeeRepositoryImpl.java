package ee.sda.repositories;

import ee.sda.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/humanresources"; //JDBC URL
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "Nomansland22";

    @Override
    public List<Employee> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Employee> employees = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(
                    DATABASE_HOST,
                    DATABASE_USERNAME,
                    DATABASE_PASSWORD);
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

        } catch (SQLException sqlexc) {
            System.out.println("Database communication error");
            sqlexc.printStackTrace();
        }
        return employees;
    }
}
