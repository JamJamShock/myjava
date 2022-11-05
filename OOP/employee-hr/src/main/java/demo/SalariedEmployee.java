package demo;

public class SalariedEmployee extends Employee{

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

    private PensionManager pensionManager;

    public void setPensionManager(PensionManager pensionManager) {
        this.pensionManager = pensionManager;
    }

    public double makePension(double amount){
        return pensionManager.makePension(amount);
    }
}
