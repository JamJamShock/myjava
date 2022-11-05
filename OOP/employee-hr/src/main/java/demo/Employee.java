package demo;

public abstract class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;

    private ILifeInsurance lifeInsurance;

    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setLifeInsurance(ILifeInsurance lifeInsurance) {
        this.lifeInsurance = lifeInsurance;
    }

    public abstract double calculateSalary();

    public double charity(int amount){
        if(amount<10){
            throw new IllegalArgumentException();
        }
        return amount;
    }
    public double makeLifeInsurance(){
        return lifeInsurance.makeLifeInsurance();
    }
}
