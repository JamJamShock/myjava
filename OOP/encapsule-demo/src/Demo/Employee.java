package Demo;

public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary/14;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
