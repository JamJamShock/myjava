package demo;

public class SalariedEmployee extends Employee {
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary;
    }
}
