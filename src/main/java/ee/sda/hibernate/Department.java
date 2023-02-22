package ee.sda.hibernate;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "departments")
public class Department {
    @Id
    private Integer departmentId;
    private String deptName;

    private List<Employee> employees;

}
