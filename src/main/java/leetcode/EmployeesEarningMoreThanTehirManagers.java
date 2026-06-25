package leetcode;

public class EmployeesEarningMoreThanTehirManagers {
    public static void main(String[] args) {
        /*
        SELECT e.name AS Employee
        FROM Employee e
        JOIN Employee m
        ON e.managerId = m.id
        WHERE e.salary > m.salary;
         */
    }
}
