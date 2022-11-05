package Demo;

public class Main {
    public static void main(String[] args) {
        Employee janeJones=new Employee(1,"Jane","Jones");
        Employee johnDoe=new Employee(2,"John","Doe");
        Employee marySmith=new Employee(3,"Mary","Smith");
        Employee mikeWilson=new Employee(4,"Mike","Wilson");
        Employee jamesMary=new Employee(5,"James","Mary");

        SimpleHashTable obj=new SimpleHashTable();
        obj.put("Jones",janeJones);
        obj.put("Doe",johnDoe);
        obj.put("Smith",marySmith);
        obj.put("Wilson",mikeWilson);
        obj.put("Mary",jamesMary);

        obj.print();

        System.out.println("Doe : " + obj.get("Doe"));
    }
}
