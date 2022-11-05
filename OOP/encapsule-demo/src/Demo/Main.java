package Demo;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.setName("Nyi Nyi");
        e2.setName("Ko Ko");

        e1.setSalary(3500);
        e2.setSalary(2500);

        System.out.println("Name : " + e1.getName());
        System.out.println("Salary : " + e1.getSalary());
    }
}
