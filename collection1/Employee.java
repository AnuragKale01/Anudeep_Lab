package collection1;
/*Write a program to define an employee class. The class should have three attributes - employeeID (int) and empolyeeName (String). Add a constructor. Overwrite the equals() method so that two employees will be equal if their employeeID are the same. Do not add any hashCode() method. Now create three employee instances with different employeeID. Create a HashSet object and add all these three employees to the set. Create another employee with the same employeeID of the first employee. Add this employee to the hashset. Observe if the employee is added or not. Print all the employees added in the hashset. */
import java.util.HashSet;

public class Employee {
    private int employeeID;
    private String employeeName;

    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return employeeID == employee.employeeID;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Alice");
        Employee emp3 = new Employee(3, "Bob");

        HashSet<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        Employee emp4 = new Employee(1, "Jane"); // Same employeeID as emp1
        boolean added = employeeSet.add(emp4);

        System.out.println("Employee added to HashSet: " + added);
        System.out.println("Employees in HashSet:");
        for (Employee emp : employeeSet) {
            System.out.println(emp.getEmployeeID() + ": " + emp.getEmployeeName());
        }
    }
}
