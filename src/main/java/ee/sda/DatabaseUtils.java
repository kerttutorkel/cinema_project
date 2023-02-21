package ee.sda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/humanresources"; //JDBC URL
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "Nomansland22";

    public Connection getConnection() throws SQLException {
        Connection conn = conn = DriverManager.getConnection(
                DATABASE_HOST, DATABASE_USERNAME, DATABASE_PASSWORD);
        return conn;
    }
}
