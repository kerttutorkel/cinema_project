package ee.sda;

import java.sql.*;

public class Main {
    public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/humanresources"; //JDBC URL
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "Nomansland22";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(
                    DATABASE_HOST,
                    DATABASE_USERNAME,
                    DATABASE_PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM departments");

            while(rs.next()) {
                Integer deptId = rs.getInt("departmentId");
                String deptName = rs.getString("name");

                System.out.println(deptId + " " + deptName);
            }

        } catch (SQLException sqlexc) {
            System.out.println("Database communication error");
            sqlexc.printStackTrace();
        } finally {

        }

    }
}