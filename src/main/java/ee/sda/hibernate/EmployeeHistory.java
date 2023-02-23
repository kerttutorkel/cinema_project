package ee.sda.hibernate;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "employee_history")
public class EmployeeHistory {
    private Integer historyId;
    private Date hireDate;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Employee employee;
}
