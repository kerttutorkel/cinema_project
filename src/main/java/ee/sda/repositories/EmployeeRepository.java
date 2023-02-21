package ee.sda.repositories;

import ee.sda.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll() throws SQLException;
}
