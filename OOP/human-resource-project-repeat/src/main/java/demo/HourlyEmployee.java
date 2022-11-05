package demo;

import demo.Employee;

public class HourlyEmployee extends Employee {
    private double workHours;
    private double workRate;

    public HourlyEmployee(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
        this.workHours = workHours;
        this.workRate = workRate;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public void setWorkRate(double workRate) {
        this.workRate = workRate;
    }

    public double calculateSalary(){
        return workHours * workRate;
    }
}
