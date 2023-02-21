package ee.sda.jdbc.repositories;

import ee.sda.jdbc.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll() throws SQLException;

    int insertEmployee(Employee employee) throws SQLException;

}
