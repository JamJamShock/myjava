package demo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        Person clonePerson = (Person) person.clone();

        System.out.println(person);
        System.out.println(clonePerson);
    }
}
