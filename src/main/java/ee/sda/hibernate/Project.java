package ee.sda.hibernate;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;
    @Column(columnDefinition = "VARCHAR(32)", name = "project_name")
    private String projectName;


    private Employee employee;

}
