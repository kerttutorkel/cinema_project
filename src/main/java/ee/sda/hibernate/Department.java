package ee.sda.hibernate;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "departments")
public class Department {
    @Id
    private Integer departmentId;
    @Column(name = "department_name", columnDefinition = "VARCHAR(16)", nullable = false)
    private String deptName;


    private List<Employee> employees;

}
