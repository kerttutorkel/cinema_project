package ee.sda;

import ee.sda.repositories.EmployeeRepository;
import ee.sda.repositories.EmployeeRepositoryImpl;
import ee.sda.repositories.ProjectRepository;
import ee.sda.repositories.ProjectRepositoryImpl;

import java.sql.*;
import java.util.List;

public class Main {


    public static void main(String[] args) throws SQLException {
        //firstExercise();
        //secondExercise();
        //thirdExercise();
        //fourthExercise();
        //fifthExercise();
        fetchAllUsingRepository();
    }

    private static List<Employee> fetchAllUsingRepository() throws SQLException {
        EmployeeRepository er = new EmployeeRepositoryImpl();
        return er.findAll();
    }

    private static List<Project> firstExercise() throws SQLException {
        ProjectRepository er = new ProjectRepositoryImpl();

        return er.findAll();
    }

    private static void secondExercise() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees");

            while (rs.next()) {
                Integer employeeId = rs.getInt("employeeId");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                Date dateOfBirth = rs.getDate("dateOfBirth");
                System.out.println(employeeId + " " + firstName + " " + lastName + " " + dateOfBirth);
            }

        } catch (SQLException sqlexc) {
            System.out.println("Database communication error");
            sqlexc.printStackTrace();
        }
    }

    private static void thirdExercise() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees WHERE firstName LIKE 'J%'");

            while (rs.next()) {
                Integer employeeId = rs.getInt("employeeId");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                Date dateOfBirth = rs.getDate("dateOfBirth");
                System.out.println(employeeId + " " + firstName + " " + lastName + " " + dateOfBirth);
            }

        } catch (SQLException sqlexc) {
            System.out.println("Database communication error");
            sqlexc.printStackTrace();
        }
    }

    private static void fourthExercise() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees " +
                    "LEFT JOIN employees_projects ON employees.employeeId = employees_projects.employeeId WHERE employeeProjectId is not NULL");

            while (rs.next()) {
                Integer employeeId = rs.getInt("employeeId");
                Integer assignmentId = rs.getInt("employeeProjectId");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                Date dateOfBirth = rs.getDate("dateOfBirth");
                System.out.println(employeeId + " " + assignmentId + " " + firstName + " " + lastName + " " + dateOfBirth);
            }

        } catch (SQLException sqlexc) {
            System.out.println("Database communication error");
            sqlexc.printStackTrace();
        }
    }

    private static void fifthExercise() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT employeeId, firstName, lastName, dateOfBirth, name  FROM employees " +
                    "JOIN departments ON departments.departmentId = employees.departmentId");

            while (rs.next()) {
                Integer employeeId = rs.getInt("employeeId");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String departmentName = rs.getString("name");

                System.out.println(employeeId + " " + departmentName + " " + firstName + " " + lastName);
            }

        } catch (SQLException sqlexc) {
            System.out.println("Database communication error");
            sqlexc.printStackTrace();
        }
    }

}