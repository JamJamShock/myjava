package demo;

public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        Manager manager=new Manager();
        Programmer programmer=new Programmer();

        Database database=new Database();

        database.addObserver(boss);
        database.addObserver(manager);
        database.addObserver(programmer);
        //database.removeObserver(boss);

        database.editRecord("delete","row 2");
    }
}
