package ee.sda.hibernate;

import java.util.Date;
import java.util.List;

public class Employee {
    private Integer employeeId;
    private String firstName;
    private String lastName;

    private Department department;

    private List<Project> project;
    private Date birthDate;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public Employee setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Employee setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }
}
