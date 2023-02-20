package ee.sda;

import java.sql.*;

public class Main {
    public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/humanresources"; //JDBC URL
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "Nomansland22";

    public static void main(String[] args) {
        //firstExercise();
        secondExercise();
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
}