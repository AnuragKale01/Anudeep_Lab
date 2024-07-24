package lab3_2;
//Write a program to define an employee class. The class should have three attributes - employeeID (int) and empolyeeName (String). Add a constructor. Overwrite the equals() method so that two employees will be equal if their employeeID are the same. Do not add any hashCode() method. Now create three employee instances with different employeeID. Create a HashSet object and add all these three employees to the set. Create another employee with the same employeeID of the first employee. Add this employee to the hashset. Observe if the employee is added or not. Print all the employees added in the hashset. 

import java.util.HashSet;

class Employee {
    private int employeeID;
    private String employeeName;

    // Constructor
    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    // Getter methods
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employeeID == employee.employeeID;
    }

    // Do not override hashCode()

    // Overriding toString() method for better readability
    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Creating three employee instances with different employeeID
        Employee emp1 = new Employee(1, "Anurag		");
        Employee emp2 = new Employee(2, "Ayushman");
        Employee emp3 = new Employee(3, "Pravinya");

        // Creating a HashSet and adding the three employees
        HashSet<Employee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Creating another employee with the same employeeID as emp1
        Employee emp4 = new Employee(1, "Johnathan Doe");

        // Adding this employee to the hashset
        employees.add(emp4);

        // Printing all the employees in the hashset
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
