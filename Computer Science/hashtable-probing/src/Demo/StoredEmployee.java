package Demo;

public class StoredEmployee {
    String key;
    Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    public String getKey() {
        return key;
    }

    public Employee getEmployee() {
        return employee;
    }
}
