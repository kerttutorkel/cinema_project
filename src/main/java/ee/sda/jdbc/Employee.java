package ee.sda.jdbc;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {

    private Integer employeeId;
    private String firstName, lastName;
    private Integer departmentId;
    private Date birthDate;

}
