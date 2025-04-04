abstract class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, int empId, double salary) {
        super(name, empId);
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

public class Payroll {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee("Kavin", 101, 50000);
        System.out.println("Employee: " + emp.name + ", Salary: ₹" + emp.calculateSalary());
    }
}
