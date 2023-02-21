package ee.sda.repositories;

import ee.sda.DatabaseUtils;
import ee.sda.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepositoryImpl {
    public List<Department> findAll() {
        List<Department> departmentList = new ArrayList<Department>();
        String selectAllDepartments = "SELECT * FROM departments";

        try (
                Connection conn = DriverManager.getConnection(
                        DatabaseUtils.DATABASE_HOST,
                        DatabaseUtils.DATABASE_USERNAME,
                        DatabaseUtils.DATABASE_PASSWORD);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(selectAllDepartments)
        ) {
            while (rs.next()) {
                Integer deptId = rs.getInt("departmentId");
                String deptName = rs.getString("name");
                Department dept = new Department(deptId, deptName);
                departmentList.add(dept);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return departmentList;
    }
}
