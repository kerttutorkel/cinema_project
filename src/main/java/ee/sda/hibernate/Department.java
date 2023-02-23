package ee.sda.hibernate;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "departments")
public class Department {
    @Id
    private Integer departmentId;
    @Column(name = "name", columnDefinition = "VARCHAR(16)", nullable = false)
    private String deptName;

    @Transient
    private List<Employee> employees = new ArrayList<>();

}
