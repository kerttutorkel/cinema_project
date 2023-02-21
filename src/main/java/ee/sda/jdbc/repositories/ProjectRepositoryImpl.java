package ee.sda.jdbc.repositories;

import ee.sda.jdbc.DatabaseUtils;
import ee.sda.jdbc.Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectRepositoryImpl implements ProjectRepository {

    public static final String DATABASE_HOST = "jdbc:mysql://localhost:3306/humanresources"; //JDBC URL
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "Nomansland22";
    private static DatabaseUtils database = new DatabaseUtils();

    public List<Project> findAll() throws SQLException {
        Connection conn = database.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        List<Project> employees = new ArrayList<>();

        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM employees");

        while(rs.next()) {
            employees.add(new Project());
        }
        return employees;
    }
}
