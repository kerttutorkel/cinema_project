package ee.sda.jdbc.repositories;

import ee.sda.jdbc.Project;

import java.sql.SQLException;
import java.util.List;

public interface ProjectRepository {
    List<Project> findAll() throws SQLException;
}
