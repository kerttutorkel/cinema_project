package ee.sda.hibernate.hr;

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

    @OneToMany(mappedBy = "department", orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();

}
