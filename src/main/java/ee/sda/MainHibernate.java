package ee.sda;

import ee.sda.hibernate.Department;
import ee.sda.jdbc.Employee;
import ee.sda.jdbc.Project;
import ee.sda.jdbc.repositories.EmployeeRepository;
import ee.sda.jdbc.repositories.EmployeeRepositoryImpl;
import ee.sda.jdbc.repositories.ProjectRepository;
import ee.sda.jdbc.repositories.ProjectRepositoryImpl;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.sql.*;
import java.util.List;
import java.util.Properties;

public class MainHibernate {


    public static void main(String[] args) throws SQLException {
        Configuration configuration = new Configuration();
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        settings.put(Environment.URL,
                "jdbc:mysql://localhost:3306/humanresources");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "Nomansland22");
        settings.put(Environment.DIALECT,
                "org.hibernate.dialect.MYSQL5Dialect");
        settings.put(Environment.SHOW_SQL, "true");
        configuration.setProperties(settings);

        configuration.addAnnotatedClass(Department.class);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Project.class);

        ServiceRegistry serviceRegistry = new
                StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
    }



}