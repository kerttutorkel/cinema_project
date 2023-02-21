package ee.sda;

import ee.sda.repositories.EmployeeRepository;
import ee.sda.repositories.EmployeeRepositoryImpl;

import java.sql.*;
import java.util.List;

public class Main {
    public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/humanresources"; //JDBC URL
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "Nomansland22";

    public static void main(String[] args) {
        //firstExercise();
        //secondExercise();
        //thirdExercise();
        //fourthExercise();
        //fifthExercise();
        fetchAllUsingRepository();
    }

    private static List<Employee> fetchAllUsingRepository() {
        EmployeeRepository er = new EmployeeRepositoryImpl();
        return er.findAll();
    }

    private static void firstExercise() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(
                    DATABASE_HOST,
                    DATABASE_USERNAME,
                    DATABASE_PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM projects");

            while(rs.next()) {
                Integer projectId = rs.getInt("projectId");
                String projectDescription = rs.getString("description");
                System.out.println(projectId + " " + projectDescription);
            }

        } catch (SQLException sqlexc) {
            System.out.println("Database communication error");
            sqlexc.printStackTrace();
        }
    }

    private static void secondExercise() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement  ps = null;

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
            conn = DriverManager.getConnection(
                    DATABASE_HOST,
                    DATABASE_USERNAME,
                    DATABASE_PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees WHERE firstName LIKE 'J%'");

            while(rs.next()) {
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
            conn = DriverManager.getConnection(
                    DATABASE_HOST,
                    DATABASE_USERNAME,
                    DATABASE_PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees " +
                    "LEFT JOIN employees_projects ON employees.employeeId = employees_projects.employeeId WHERE employeeProjectId is not NULL");

            while(rs.next()) {
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
            conn = DriverManager.getConnection(
                    DATABASE_HOST,
                    DATABASE_USERNAME,
                    DATABASE_PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT employeeId, firstName, lastName, dateOfBirth, name  FROM employees " +
                    "JOIN departments ON departments.departmentId = employees.departmentId");

            while(rs.next()) {
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