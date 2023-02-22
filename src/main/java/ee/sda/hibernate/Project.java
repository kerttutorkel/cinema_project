package ee.sda.hibernate;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "projects")
public class Project {

    private Integer projectId;
    private String projectName;
    private Employee employee;

}
