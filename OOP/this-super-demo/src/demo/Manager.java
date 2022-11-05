package demo;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name,double salary){
        super(name,salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary(){
        return super.getSalary() + bonus;
    }

    public static void main(String[] args) {
        /*Manager m1=new Manager("John Doe", 2000);
        m1.setBonus(1000);
        System.out.println("salary : " + m1.getSalary());*/

        Employee e1=new Employee("John Doe",2000);
        System.out.println(e1);
    }
}
