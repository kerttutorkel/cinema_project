package ee.sda.hibernate.hr;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;
    @Column(columnDefinition = "VARCHAR(32)", name = "project_name")
    private String projectName;

    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = { @JoinColumn(name = "projectId") },
            inverseJoinColumns = { @JoinColumn(name = "employeeId") })
    private List<Employee> employee;

}
