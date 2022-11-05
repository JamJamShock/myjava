package demo;

import demo.Employee;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary;
    }
}
