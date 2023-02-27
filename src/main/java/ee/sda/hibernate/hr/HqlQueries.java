package ee.sda.hibernate.hr;

public interface HqlQueries {
    /* HQL!
1. Display all projects: (HQL: FROM Project) (SQL: SELECT * FROM projects)
2. Display all employees (HQL: FROM Employee) (SQL: SELECT * FROM employees)
3. Display all employees with names starting with the letter J (HQL: FROM Employee e WHERE e.firstName LIKE 'J%')
4. Display all employees working in the Finance department :
                      HQL: FROM Employee e JOIN Department d WHERE d.name = 'Finance'
                      SQL: SELECT firstName FROM employees e JOIN departments d ON d.department_id = e.department_id
5. Display all employees alphabetically by firstName
                      HQL: from Employee e order be e.firstName
     */
}
