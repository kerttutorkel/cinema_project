package ee.sda.hibernate.hr;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee { //many side

    @Id
    private Integer employeeId;
    @Column(name = "first_name", columnDefinition = "VARCHAR(24)", nullable = false)
    private String firstName;
    @Column(name = "last_name", columnDefinition = "VARCHAR(24)", nullable = false)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(mappedBy = "employee")
    private List<Project> project;

    @Column(name = "birth_date", columnDefinition = "DATE", nullable = false)
    private LocalDate birthDate;

}
