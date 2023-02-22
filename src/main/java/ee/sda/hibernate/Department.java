package ee.sda.hibernate;

import java.util.List;

public class Department {
    private Integer deptId;
    private String deptName;

    private List<Employee> employees;

    public Department(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}
