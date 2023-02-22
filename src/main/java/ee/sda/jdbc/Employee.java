package ee.sda.jdbc;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class Employee {

    private Integer employeeId;
    private String firstName, lastName;
    private Integer departmentId;
    private Date birthDate;

}
