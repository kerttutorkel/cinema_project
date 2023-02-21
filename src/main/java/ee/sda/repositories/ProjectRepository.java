package ee.sda.repositories;

import ee.sda.Project;

import java.sql.SQLException;
import java.util.List;

public interface ProjectRepository {
    List<Project> findAll() throws SQLException;
}
