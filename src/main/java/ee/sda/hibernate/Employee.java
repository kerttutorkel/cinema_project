package ee.sda.hibernate;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    private Integer employeeId;
    @Column(name = "first_name", columnDefinition = "VARCHAR(24)", nullable = false)
    private String firstName;
    @Column(name = "last_name", columnDefinition = "VARCHAR(24)", nullable = false)
    private String lastName;

    @Transient
    private Department department;
    @Transient
    private List<Project> project;

    @Column(name = "last_name", columnDefinition = "DATE", nullable = false)
    private LocalDate birthDate;

}
