package ee.sda.jdbc;

import java.util.Date;

public class Employee {
    private Integer employeeId;
    private String firstName, lastName;
    private Integer departmentId;
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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public Employee setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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
