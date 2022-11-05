package demo;

public class HourlyEmployee extends Employee {
    private double workHours;
    private double workingRate;

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public void setWorkingRate(double workingRate) {
        this.workingRate = workingRate;
    }

    public HourlyEmployee(int employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
        this.workHours = workHours;
        this.workingRate = workingRate;
    }

    public double calculateSalary(){
        return workHours * workingRate;
    }
}
