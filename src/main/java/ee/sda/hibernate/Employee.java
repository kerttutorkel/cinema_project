package ee.sda.hibernate;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private Department department;
    private List<Project> project;
    private Date birthDate;

}
